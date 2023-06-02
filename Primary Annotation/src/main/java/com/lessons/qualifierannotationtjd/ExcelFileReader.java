package com.lessons.qualifierannotationtjd;

import org.springframework.stereotype.Component;

@Component
public class ExcelFileReader implements Reader{
    @Override
    public String readFile() {
        return "EXCEL File Reader";
    }
}
