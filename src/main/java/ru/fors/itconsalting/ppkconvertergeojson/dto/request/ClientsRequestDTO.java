package ru.fors.itconsalting.ppkconvertergeojson.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ClientsRequestDTO {
    @JsonProperty("Client")
    private ClientRequestDTO client;
}
