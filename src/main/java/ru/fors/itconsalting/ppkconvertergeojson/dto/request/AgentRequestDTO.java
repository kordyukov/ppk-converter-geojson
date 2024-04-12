package ru.fors.itconsalting.ppkconvertergeojson.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AgentRequestDTO {
    @JsonProperty("Appointment")
    private String appointment;
    @JsonProperty("FamilyName")
    private String familyName;
    @JsonProperty("FirstName")
    private String firstName;
    @JsonProperty("Patronymic")
    private String patronymic;
}
