package com.codestates.githubActionsTest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @GetMapping
    public String hello(){
        return "Hello";
    }
}
