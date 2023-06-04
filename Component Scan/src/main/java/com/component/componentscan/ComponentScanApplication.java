package com.component.componentscan;

import com.component.branch.MyComponent;
import com.component.branch.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan(basePackages = "com.component.branch")
//@ComponentScan(basePackages = "com.component")
//@ComponentScan(basePackages = {"com.component.branch", "com.component"})
//@ComponentScan(basePackageClasses = MyComponent.class)
//@ComponentScan(basePackageClasses = MyService.class)
//@ComponentScan(basePackageClasses = {MyComponent.class, MyService.class})
//@ComponentScan(useDefaultFilters = false)
public class ComponentScanApplication {

    @Autowired
    private MyComponent myComponent;

    @Autowired
    private MyService myService;

    public static void main(String[] args) {
        SpringApplication.run(ComponentScanApplication.class, args);
    }

}