package com.lessons.qualifierannotationtjd;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("PDF")
@Primary
public class PdfFileReader implements Reader{
    @Override
    public String readFile() {
        return "PDF File Reader";
    }
}
