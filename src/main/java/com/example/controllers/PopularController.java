package com.example.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books")
public class PopularController {
    @GetMapping("/popular")
    public String popularPage(){
        return "popular";
    }
}
