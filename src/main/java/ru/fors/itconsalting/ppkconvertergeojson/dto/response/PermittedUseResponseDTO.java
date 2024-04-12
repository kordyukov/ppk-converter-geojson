package ru.fors.itconsalting.ppkconvertergeojson.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PermittedUseResponseDTO {
    @JsonProperty("по документу")
    private String fromDocument;
    @JsonProperty("по справочнику")
    private String fromGuide;
}
