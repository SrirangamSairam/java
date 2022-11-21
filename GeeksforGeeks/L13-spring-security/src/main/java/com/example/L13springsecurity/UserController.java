package com.example.L13springsecurity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/hello")
    public String getHello() {
        AppUser appUser = (AppUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        if(appUser == null)
//            return "Hello user";
        return "Hello " + appUser.getUsername() + " " + appUser.getPassword() + " " + appUser.getId() + " by " + Thread.currentThread().getName();
    }

    @PostMapping("/hello/post")
    public String postHello() {
        AppUser appUser = (AppUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        if(appUser == null)
//            return "Hello user";
        return "Hello " + appUser.getUsername() + " " + appUser.getPassword() + " " + appUser.getId() + " by " + Thread.currentThread().getName();
    }
}
