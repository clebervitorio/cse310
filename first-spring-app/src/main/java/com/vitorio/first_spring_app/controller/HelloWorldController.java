package com.vitorio.first_spring_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vitorio.first_spring_app.domain.User;
import com.vitorio.first_spring_app.service.HelloWorldService;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

//    public HelloWorldController(HelloWorldService helloWorldService) {
//        this.helloWorldService = helloWorldService;
//    }
    // This method will be called when a GET, POST, DELETE, PUT, PATCH, OPTIONS, HEAD or other request is made to /hello-world
    // This method will respond with the string "Hello World!" when a GET request is made to /hello-world
    @GetMapping
    public String helloWorld() {
        return helloWorldService.helloWorld(" Vitorio");
    }

//    @PostMapping("")
    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable String id, @RequestParam(value = "filter", defaultValue = "Nenhum") String filter, @RequestBody User body) {
        return "Hello World POST! " + body.getName() + id;
    }
}   