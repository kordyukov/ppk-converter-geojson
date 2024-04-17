package ru.fors.itconsalting.ppkconvertergeojson.service.converter;

//TODO нужна формула преобразования координат MSK-01 в EPSG::3857
public class PpkConverter {
    final static double RADIUS_MAJOR = 6378137.0;
    public static double convertX(double x) {
        return x * 11.34299224026393;
    }

    public static double convertY(double y) {
        return y * 7.508882840149855;
    }
}
