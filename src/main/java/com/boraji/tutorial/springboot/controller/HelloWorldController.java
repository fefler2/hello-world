
package com.boraji.tutorial.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/")
    @ResponseBody

    public String sayHello() {
        return "Strona glowna";
    }

    @RequestMapping(value = "/a")
    public String sayHello2() {
        return "Hello Spring Boot2!!";
    }


    @RequestMapping("/b")
    public String sayHello3() {
        return "Hello Spring Boot3!!";
    }

    @RequestMapping("/d")
    public String sayHello4(){
        return "abc";
    }

}