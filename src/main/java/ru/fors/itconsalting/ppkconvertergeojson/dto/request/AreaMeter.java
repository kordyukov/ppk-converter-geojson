package ru.fors.itconsalting.ppkconvertergeojson.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AreaMeter {
    @JsonProperty("Area")
    private String area;
    @JsonProperty("Unit")
    private String unit;
    @JsonProperty("Inaccuracy")
    private String inaccuracy;
}
