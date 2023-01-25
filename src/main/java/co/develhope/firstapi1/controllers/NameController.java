package co.develhope.firstapi1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class NameController{
    private final String MY_NAME = "Alina";
    @GetMapping(value = "/")
    public String getName(){
        return MY_NAME;
    }
    @PostMapping(value = "/")
    public String getReversedName(){
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.append(MY_NAME).reverse().toString();
    }
}