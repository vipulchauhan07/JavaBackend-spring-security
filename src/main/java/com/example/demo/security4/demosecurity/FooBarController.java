package com.example.demo.security4.demosecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooBarController {

    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/student")
    public String getStudent() {
        return "Hello student!";
    }

    @GetMapping("/admin")
    public String getAdmin() {
        return "Hello admin!";
    }

    @GetMapping("/visitor")
    public String getVisitor() {
        return "Hello Visitor!";
    }

    // how to create apis and their name for ease of authentication and authorization
    // /book -get method
    // /book -post method
    // /book/{id} - getting one book
}
