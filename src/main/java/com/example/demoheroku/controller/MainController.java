package com.example.demoheroku.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class MainController {


    @GetMapping
    public String main(){
        return "MAIN PAGE";
    }

}
