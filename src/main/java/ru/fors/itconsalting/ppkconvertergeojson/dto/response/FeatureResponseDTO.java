package ru.fors.itconsalting.ppkconvertergeojson.dto.response;

import lombok.Data;

import static ru.fors.itconsalting.ppkconvertergeojson.constant.PpkConstantEnum.FEATURE_CONST;

@Data
public class FeatureResponseDTO {
    private String type = FEATURE_CONST.getValue();
    private PropertiesResponseDTO properties;
    private GeometryResponseDTO geometry;
}
