
package com.boraji.tutorial.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
public class HelloWorldController {
    @RequestMapping(value = "/")
    @ResponseBody

    public String sayHello() {
        return "Strona glowna";
    }

    @RequestMapping(value = "/a", headers="name=pankaj")
    @ResponseBody
    public String sayHello2() {
        return "Hello Spring Boot2!!";
    }

    @RequestMapping(value = "/ac", headers = "key=val", method = GET)
    @ResponseBody
    public String getFoosWithHeader() {
        return "Get some Foos with Header";
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