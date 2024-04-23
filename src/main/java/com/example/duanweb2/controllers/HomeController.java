package com.example.duanweb2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
    @GetMapping("/")
    public String Index() {
        return "home/index";
    }
}
