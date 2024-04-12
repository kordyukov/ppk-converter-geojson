package ru.fors.itconsalting.ppkconvertergeojson.controller;

import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import ru.fors.itconsalting.ppkconvertergeojson.service.PpkConverterService;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import static ru.fors.itconsalting.ppkconvertergeojson.constant.PpkConstantEnum.CONVERT_FILE_NAME;

@Controller
@RequiredArgsConstructor
public class PpkConverterController {
    private final PpkConverterService ppkConverterService;

    @RequestMapping(value = "/upload", method = RequestMethod.GET)
    public @ResponseBody String provideUploadInfo() {
        return "Вы можете загружать файл с использованием того же URL.";
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public @ResponseBody ResponseEntity<byte[]> handleFileUpload(@RequestParam("name") String name,
                            @RequestParam("file") MultipartFile file) throws IOException {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentDispositionFormData("filename", CONVERT_FILE_NAME.getValue());

        return new ResponseEntity<>(ppkConverterService.convertToGeojson(file.getBytes()), headers, HttpStatus.OK);
    }
}
