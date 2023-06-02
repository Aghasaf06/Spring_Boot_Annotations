package com.lessons.qualifierannotationtjd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class MyController {

    @Autowired
    private Reader reader;

    @Autowired
    @Qualifier("excelFileReader")
    private Reader reader2;

    @GetMapping(path = "/read")
    public String read() {
        return reader.readFile() + " --- " + reader2.readFile();
    }
}
