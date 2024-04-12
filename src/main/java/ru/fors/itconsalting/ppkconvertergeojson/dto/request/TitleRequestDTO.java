package ru.fors.itconsalting.ppkconvertergeojson.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TitleRequestDTO {
    @JsonProperty("Clients")
    private ClientsRequestDTO clients;
    @JsonProperty("Contractor")
    private ContractorRequestDTO contractor;
}
