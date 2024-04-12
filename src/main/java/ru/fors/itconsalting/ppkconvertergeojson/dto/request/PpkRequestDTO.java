package ru.fors.itconsalting.ppkconvertergeojson.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PpkRequestDTO {
    @JsonProperty("NameSoftware")
    private String nameSoftware;
    @JsonProperty("VersionSoftware")
    private String versionSoftware;
    @JsonProperty("GUID")
    private String gUID;
    @JsonProperty("Title")
    private TitleRequestDTO title;
    @JsonProperty("EntitySpatial")
    private EntitySpatialRequestDTO entitySpatial;
    @JsonProperty("Area")
    private AreaRequestDTO area;
    @JsonProperty("CoordSystems")
    private CoordSystemsRequestDTO coordSystems;
    @JsonProperty("Diagram")
    private DiagramRequestDTO diagram;
}


