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
        return "Hello " + name + " are you ready to blast? 3. 2. 1. ....  PIKACHU!!";
    }

    @GetMapping("/programmer")
    public List<String>  showAllProgrammer(){
        String programmer1 = "UI/UX";
        String programmer2 = "Java";
        return List.of(programmer1,programmer2);
        }


    @GetMapping("/coffee")
    public List<String>  showAllCoffee(){
        String coffee1 = "Mocha";
        String coffee2 = "Dark Coffee";
        return List.of(coffee2,coffee1);
        }

    @GetMapping("/cars")
    public List<String> showAllCar(){
        String car1 = "Toyota";
        String car2 = "Mitsubishi";
        return List.of(car1,car2);
        }

    @GetMapping("/animals")
    public List<String> showAllAnimals(){
        String animal = "Lion";
        String animal2 = "Tiger";
        return List.of(animal,animal2);
    }
    

    @GetMapping("/person")
    public List<String> showAllPerson(){
        String person1 = "John";
        String person2 = "simon";

        return List.of(person1,person2);
    }

    @GetMapping("/Dog")
    public List<String> showAllDog(){
        String dog1 = "Bulldog";
        String dog2 = "Shitszu";

        return List.of(dog1,dog2);
    }

    



    
}
