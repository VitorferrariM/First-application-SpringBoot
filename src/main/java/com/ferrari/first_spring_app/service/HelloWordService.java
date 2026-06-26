package com.ferrari.first_spring_app.service;


import org.springframework.stereotype.Service;

@Service
public class HelloWordService {



    public String HelloWord(String name) {

        return "hello word!" + name;


    }
}
