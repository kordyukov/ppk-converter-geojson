package ru.fors.itconsalting.ppkconvertergeojson.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class SpatialElementRequestDTO {
    @JsonProperty("SpelementUnit")
    private List<SpelementUnitRequestDTO> spelementUnit;
}
