package ru.fors.itconsalting.ppkconvertergeojson.service;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;

public interface PpkConverterService {
    byte[] convertToGeojson(byte[] stream) throws IOException;
}
