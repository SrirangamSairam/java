package com.example.L10MiniProject.controller;

import com.example.L10MiniProject.entity.Flat;
import com.example.L10MiniProject.service.FlatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private FlatService flatService;

    @PostMapping("/createFlat")
    public ResponseEntity<Flat> createFlat(@RequestBody Flat flat) {
        flat = flatService.createFlat(flat);
        URI uri = null;
        try {
            uri = new URI("/admin/getFlat/" + flat.getId());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        assert uri != null;
        return ResponseEntity.created(uri).body(flat);
    }
}
