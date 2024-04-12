package ru.fors.itconsalting.ppkconvertergeojson.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ContractorRequestDTO {
    @JsonProperty("CadastralEngineer")
    private CadastralEngineerRequestDTO cadastralEngineer;
}
