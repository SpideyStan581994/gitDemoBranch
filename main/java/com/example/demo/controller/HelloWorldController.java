package com.example.demo.controller;

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
        return "Hello " + name + " are you ready to blast? 3. 2. 1. ....  KABOOM!!";
    }


    @GetMapping("/animals")
    public List<String> showAllAnimals(){
        String animal = "Lion";
        String animal2 = "Tiger";
        return List.of(animal,animal2);
    }
    
    @GetMapping("/cars")
    public List<String> showAllCar(){
        String car1 = "Toyota";
        String car2 = "Mitsubishi";
        return List.of(car1,car2);
    }

    @GetMapping("/person")
    public List<String> showAllPerson(){
        String person1 = "Steven";
        String person2 = "Jay";
        return List.of(person1,person2);
    }



    
}
