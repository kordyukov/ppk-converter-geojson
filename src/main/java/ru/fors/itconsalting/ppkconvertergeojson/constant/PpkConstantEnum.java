package ru.fors.itconsalting.ppkconvertergeojson.constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum PpkConstantEnum {
    FEATURE_COLLECTION_CONST("FeatureCollection"),
    FEATURE_CONST("Feature"),
    COORDINATE_CONST("urn:ogc:def:crs:EPSG::3857"),
    POLYGON_CONST("Polygon"),
    CONVERT_FILE_NAME("convertToGeojson.geojson");
    private final String value;
}
