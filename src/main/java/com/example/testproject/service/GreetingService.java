package com.example.testproject.service;

import org.springframework.stereotype.Component;

@Component
public class GreetingService {

    public String helloWorld() {
        return"Hola Mundo";
    }

}
