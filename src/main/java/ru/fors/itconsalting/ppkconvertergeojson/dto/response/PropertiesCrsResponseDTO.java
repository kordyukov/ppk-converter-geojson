package ru.fors.itconsalting.ppkconvertergeojson.dto.response;

import lombok.Data;

import static ru.fors.itconsalting.ppkconvertergeojson.constant.PpkConstantEnum.COORDINATE_CONST;

@Data
public class PropertiesCrsResponseDTO {
    private String name = COORDINATE_CONST.getValue();
}
