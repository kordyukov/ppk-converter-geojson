package ru.fors.itconsalting.ppkconvertergeojson.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class OrganizationRequestDTO {
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Agent")
    private AgentRequestDTO agent;
    @JsonProperty("AddressOrganization")
    private String addressOrganization;
    @JsonProperty("CodeOGRN")
    private String codeOGRN;
}
