
package com.boraji.tutorial.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/a")
    public String sayHello() {
        return "Hello Spring Boot!!";
    }
    @RequestMapping("/b")
    public String sayHello2() {
        return "Hello Spring Boot2!!";
    }

}