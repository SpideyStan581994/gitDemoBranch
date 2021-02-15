package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("/select")
    public List<String> showAllItems(@RequestParam(name = "item", defaultValue = "none") String item)
    {
        if(item.equals("coffee")){
            String coffee1 = "Mocha";
            String coffee2 = "Dark Coffee";
            return List.of(coffee2,coffee1);
        

        }
        else if(item.equals("car")){
            String car1 = "Toyota";
            String car2 = "Mitsubishi";
            return List.of(car1,car2);
        }
        else if (item.equals("animals"))
        {
            String animal = "Lion";
            String animal2 = "Tiger";
            return List.of(animal,animal2);
        }
        else if(item.equals("person")){
            String person1 = "John";
            String person2 = "simon";
    
            return List.of(person1,person2);
        }

        else if(item.equals("dog")){
            String dog1 = "Bulldog";
            String dog2 = "Shitszu";
    
            return List.of(dog1,dog2);
        }

        else{
            return List.of("No Item Selected.");
        }

    }


    




    
}
