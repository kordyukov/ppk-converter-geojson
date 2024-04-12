package ru.fors.itconsalting.ppkconvertergeojson.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AppliedFileRequestDTO {
    @JsonProperty("Kind")
    private String kind;
    @JsonProperty("Name")
    private String name;
}
