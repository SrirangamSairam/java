package com.example.springbootdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerTwo {
    @GetMapping("/hi")
    @ResponseBody
    public String hi() {
        return "howru.html";
    }
}
