package ru.fors.itconsalting.ppkconvertergeojson.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SpelementUnitRequestDTO {
    @JsonProperty("TypeUnit")
    private String typeUnit;
    @JsonProperty("SuNmb")
    private String suNmb;
    @JsonProperty("Ordinate")
    private OrdinateRequestDTO ordinate;
}
