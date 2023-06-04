package com.componentscan2;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    public MyComponent() {
        System.out.println("My Component created!");
    }
}