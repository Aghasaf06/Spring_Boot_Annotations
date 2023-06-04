package com.componentscan2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.branch", useDefaultFilters = true)
public class ComponentScan2Application {

    public static void main(String[] args) {
        SpringApplication.run(ComponentScan2Application.class, args);
    }

}
