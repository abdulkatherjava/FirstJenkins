package com.example.DemoApplication.service;

import org.springframework.stereotype.Service;

@Service
public class SampleService {
    public String getMessage() {
        System.out.println("enter into the service");
        return "Hello, Karate!";
    }
}
