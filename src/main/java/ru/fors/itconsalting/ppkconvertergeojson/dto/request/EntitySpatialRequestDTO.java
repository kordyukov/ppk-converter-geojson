package ru.fors.itconsalting.ppkconvertergeojson.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class EntitySpatialRequestDTO {
    @JsonProperty("EntSys")
    private String entSys;
    @JsonProperty("SpatialElement")
    private SpatialElementRequestDTO spatialElement;
}
