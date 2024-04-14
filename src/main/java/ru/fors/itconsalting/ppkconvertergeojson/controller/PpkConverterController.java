package ru.fors.itconsalting.ppkconvertergeojson.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import ru.fors.itconsalting.ppkconvertergeojson.service.PpkConverterService;

import java.io.IOException;

import static ru.fors.itconsalting.ppkconvertergeojson.constant.PpkConstantEnum.CONVERT_FILE_NAME;

@Controller
@RequiredArgsConstructor
public class PpkConverterController {
    private final PpkConverterService ppkConverterService;
    private final HttpHeaders headers;

    @RequestMapping(value = "/upload", method = RequestMethod.GET)
    public @ResponseBody String provideUploadInfo() {
        return "Вы можете загружать файл с использованием того же URL.";
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public ResponseEntity<byte[]> handleFileUpload(@RequestParam("name") String name,
                                                   @RequestParam("file") MultipartFile file) throws IOException {

        headers.setContentDispositionFormData("filename", CONVERT_FILE_NAME.getValue());
        return ResponseEntity.status(HttpStatus.OK)
                .headers(headers)
                .body(ppkConverterService.convertToGeojson(file.getBytes()));
    }

}
