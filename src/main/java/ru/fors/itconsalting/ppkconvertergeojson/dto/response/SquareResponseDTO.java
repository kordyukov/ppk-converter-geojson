package ru.fors.itconsalting.ppkconvertergeojson.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SquareResponseDTO {
    @JsonProperty("Значение")
    public int value;
    @JsonProperty("ед.изм")
    public String ed;
    @JsonProperty("Точность")
    public String accuracy;
}
