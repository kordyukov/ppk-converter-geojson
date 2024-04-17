package ru.fors.itconsalting.ppkconvertergeojson.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lombok.RequiredArgsConstructor;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import ru.fors.itconsalting.ppkconvertergeojson.dto.request.PpkRequestDTO;
import ru.fors.itconsalting.ppkconvertergeojson.dto.request.SpelementUnitRequestDTO;
import ru.fors.itconsalting.ppkconvertergeojson.dto.response.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Collections;
import java.util.List;

import static java.lang.Double.parseDouble;
import static ru.fors.itconsalting.ppkconvertergeojson.constant.PpkConstantEnum.CONVERT_FILE_NAME;
import static ru.fors.itconsalting.ppkconvertergeojson.constant.PpkConstantEnum.POLYGON_CONST;
import static ru.fors.itconsalting.ppkconvertergeojson.service.converter.PpkConverter.convertX;
import static ru.fors.itconsalting.ppkconvertergeojson.service.converter.PpkConverter.convertY;

@Service
@RequiredArgsConstructor
public class PpkConverterServiceImpl implements PpkConverterService {
    private final static Logger log = LoggerFactory.getLogger(PpkConverterServiceImpl.class);
    private final XmlMapper xmlMapper;
    private final ObjectMapper objectMapper;

    @Override
    public byte[] convertToGeojson(byte[] stream) throws IOException {
        log.info("start converting convertToGeojson");
        JsonNode jsonNode = xmlMapper.readValue(stream, JsonNode.class);
        PpkRequestDTO ppkRequestDTO = objectMapper.readValue(jsonNode.toPrettyString(), PpkRequestDTO.class);
        List<SpelementUnitRequestDTO> spelementUnit = ppkRequestDTO.getEntitySpatial().getSpatialElement().getSpelementUnit();
        PpkResponseDTOResponseDTO ppkResponseDTOResponseDTO = new PpkResponseDTOResponseDTO();
        FeatureResponseDTO featureResponseDTO = new FeatureResponseDTO();
        GeometryResponseDTO geometryResponseDTO = new GeometryResponseDTO();
        geometryResponseDTO.setType(POLYGON_CONST.getValue());

        CrsResponseDTO crsResponseDTO = new CrsResponseDTO();
        crsResponseDTO.setType(ppkRequestDTO.getTitle().getClients().getClient().getOrganization().getName());
        crsResponseDTO.setProperties(new PropertiesCrsResponseDTO());
        ppkResponseDTOResponseDTO.setCrs(crsResponseDTO);
        List<List<Double>> coordinatesResponse = spelementUnit
                .stream()
                .map(SpelementUnitRequestDTO::getOrdinate)
                .map(ordinateRequest -> List.of(convertX(parseDouble(ordinateRequest.getX())),
                        convertY(parseDouble(ordinateRequest.getY()))))
                .toList();

        geometryResponseDTO.setCoordinates(Collections.singletonList(coordinatesResponse));
        featureResponseDTO.setProperties(new PropertiesResponseDTO());
        featureResponseDTO.setGeometry(geometryResponseDTO);
        ppkResponseDTOResponseDTO.setFeatures(List.of(featureResponseDTO));

        String basePathOfClass = getClass()
                .getProtectionDomain().getCodeSource().getLocation().getFile();
        File file = new File(basePathOfClass, CONVERT_FILE_NAME.getValue());
        Files.writeString(file.toPath(), objectMapper.writeValueAsString(ppkResponseDTOResponseDTO));
        log.info("end converting convertToGeojson");
        return IOUtils.toByteArray(file.toURI());
    }

}
