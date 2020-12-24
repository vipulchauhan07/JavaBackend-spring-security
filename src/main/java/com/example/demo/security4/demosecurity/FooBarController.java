package com.example.demo.security4.demosecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooBarController {

    @GetMapping("/foo")
    public String foo() {
        return "Hello Foo!";
    }

    @GetMapping("/bar")
    public String bar() {
        return "Hello Bar!";
    }

}
