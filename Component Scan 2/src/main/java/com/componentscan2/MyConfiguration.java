package com.componentscan2;

import com.branch.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;

@Configuration
//-------------------------------------------------------------------------------------
/*
@ComponentScan(
    basePackages = "com.branch",
        useDefaultFilters = false,
            includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,
                classes = {TalyshJavaDeveloper.class, Component.class})
)

 */
//-------------------------------------------------------------------------------------
/*
@ComponentScan(
    basePackages = "com.branch",
        includeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,
            classes = MyClass3.class)
)

 */
//-------------------------------------------------------------------------------------
/*
@ComponentScan(
    basePackages = "com.branch",
        useDefaultFilters = false,
            includeFilters = @ComponentScan.Filter(type = FilterType.REGEX,
                pattern = ".*[12]")
)

 */
//-------------------------------------------------------------------------------------
//@ComponentScan(basePackages = "com.branch")
//-------------------------------------------------------------------------------------
/*
@ComponentScan(
    basePackages = "com.branch",
        useDefaultFilters = false,
            includeFilters = @ComponentScan.Filter(type = FilterType.ASPECTJ,
                pattern = "com.branch.*")
)

 */
//-------------------------------------------------------------------------------------
/*
@ComponentScan(
    basePackages = "com.branch",
        useDefaultFilters = true,
            includeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,
                classes = {MyClass1.class, MyClass3.class}),
                    excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,
                        classes = MyClass2.class)
)

 */
//-------------------------------------------------------------------------------------
/*
@ComponentScan(basePackages = "com.branch",
    useDefaultFilters = false,
        includeFilters = @ComponentScan.Filter(type = FilterType.CUSTOM,
            classes = MyCustomFilter.class)
)

 */
//-------------------------------------------------------------------------------------
@ComponentScan(basePackages = "com.branch", useDefaultFilters = false)
public class MyConfiguration {

//    @Autowired
//    private MyClass1 myClass1;
//
//    @Autowired
//    private MyClass2 myClass2;
//
//    @Autowired
//    private MyClass3 myClass3;
//
//    @Autowired
//    private MyClass4 myClass4;
}