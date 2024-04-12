package ru.fors.itconsalting.ppkconvertergeojson.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CadastralEngineerRequestDTO {
    @JsonProperty("FamilyName")
    private String familyName;
    @JsonProperty("FirstName")
    private String firstName;
    @JsonProperty("Patronymic")
    private String patronymic;
    @JsonProperty("NCertificate")
    private String nCertificate;
    @JsonProperty("Telephone")
    private String telephone;
    @JsonProperty("Address")
    private String address;
    @JsonProperty("Email")
    private String email;
    @JsonProperty("INN")
    private String iNN;
    @JsonProperty("Organization")
    private OrganizationRequestDTO organization;
}
