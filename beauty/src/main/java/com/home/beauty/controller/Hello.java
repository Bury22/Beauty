package com.home.beauty.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class Hello {
    /**
     * @return hello
     */
    @RequestMapping("hello")
    public String sayHello() {
        return "hello, my wife!";
    }
}
