package com.example.Training.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestPageController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/page2")
    public String page2() {
        return "page2"; // laddar page2.html från templates
    }
}
