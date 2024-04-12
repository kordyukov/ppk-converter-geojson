package ru.fors.itconsalting.ppkconvertergeojson.dto.response;

import lombok.Data;

import java.util.List;

import static ru.fors.itconsalting.ppkconvertergeojson.constant.PpkConstantEnum.FEATURE_COLLECTION_CONST;

@Data
public class PpkResponseDTOResponseDTO {
    private String type = FEATURE_COLLECTION_CONST.getValue();
    private List<FeatureResponseDTO> features;
    private CrsResponseDTO crs;
}


