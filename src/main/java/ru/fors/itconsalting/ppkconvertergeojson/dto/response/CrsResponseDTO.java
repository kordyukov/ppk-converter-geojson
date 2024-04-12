package ru.fors.itconsalting.ppkconvertergeojson.dto.response;

import lombok.Data;

@Data
public class CrsResponseDTO {
    private String type;
    private PropertiesCrsResponseDTO properties;
}
