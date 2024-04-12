package ru.fors.itconsalting.ppkconvertergeojson.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CoordSystemRequestDTO {
    @JsonProperty("Name")
    private String name;
    @JsonProperty("CsId")
    private String csId;
}
