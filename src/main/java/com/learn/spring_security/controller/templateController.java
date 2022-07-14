package com.learn.spring_security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class templateController {

    @GetMapping("login")
    public String loginPageView(){
        return "login";
    }
    @GetMapping("courses")
    public String coursesPageView(){
        return "courses";
    }
}
