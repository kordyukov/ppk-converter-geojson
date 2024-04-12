package ru.fors.itconsalting.ppkconvertergeojson.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class OrdinateRequestDTO {
    @JsonProperty("GeopointOpred")
    private String geopointOpred;
    @JsonProperty("X")
    private String x;
    @JsonProperty("Y")
    private String y;
    @JsonProperty("NumGeopoint")
    private String numGeopoint;
    @JsonProperty("DeltaGeopoint")
    private String deltaGeopoint;
}
