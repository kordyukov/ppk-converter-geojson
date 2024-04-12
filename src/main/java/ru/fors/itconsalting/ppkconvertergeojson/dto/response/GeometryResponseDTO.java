package ru.fors.itconsalting.ppkconvertergeojson.dto.response;

import lombok.Data;

import java.util.List;

@Data
public class GeometryResponseDTO {
    private List<List<List<Double>>> coordinates;
    private String type;
}
