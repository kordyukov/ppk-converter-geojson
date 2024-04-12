package ru.fors.itconsalting.ppkconvertergeojson.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ClientRequestDTO {
    @JsonProperty("Date")
    private String date;
    @JsonProperty("Organization")
    private OrganizationRequestDTO organization;
}
