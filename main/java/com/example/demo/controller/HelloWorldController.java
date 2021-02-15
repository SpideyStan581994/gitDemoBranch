package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {


    @GetMapping("/greetings")
    public String helloWorld(@RequestParam(name = "name", defaultValue = "john") String name){
        return "Hello " + name;
    }

    @GetMapping("/kaboom")
    public String kaboom(@RequestParam(name = "name", defaultValue = "none") String name)
    {
        return "Hello " + name + " are you ready to blast? 3. 2. 1. ....  PIKACHU!!";
    }



    
}
