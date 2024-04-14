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
    CONVERT_FILE_NAME("convertToGeojson.geojson"),
    REDIRECT_URL("https://pkk.rosreestr.ru/#/draw/11.21836548226393,5.93634102429724/19/@5w3tqw5cd");
    private final String value;
}
