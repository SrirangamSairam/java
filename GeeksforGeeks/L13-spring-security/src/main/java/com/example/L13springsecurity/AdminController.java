package com.example.L13springsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AppUserService appUserService;

    @GetMapping("/hello")
    public ResponseEntity<String> getHello() {
        AppUser appUser = (AppUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return ResponseEntity.ok("Hello Admin " + appUser.getUsername());
    }

    @PostMapping("/createUser")
    public ResponseEntity<AppUser> createUser(@RequestBody AppUser appUser) {
        appUser = appUserService.createUser(appUser);
        return ResponseEntity.ok(appUser);
    }
}
