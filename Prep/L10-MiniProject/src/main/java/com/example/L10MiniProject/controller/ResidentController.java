package com.example.L10MiniProject.controller;

import com.example.L10MiniProject.dto.VisitStatus;
import com.example.L10MiniProject.entity.Visit;
import com.example.L10MiniProject.service.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/resident")
public class ResidentController {

    @Autowired
    private VisitService visitService;

    @PutMapping("/approveVisit/{id}/{visitStatus}")
    public ResponseEntity<Visit> approveVisit(@PathVariable int id, @PathVariable VisitStatus visitStatus) {
        Visit visit = visitService.updateVisitStatus(id, visitStatus);
        URI uri = null;
        try {
            uri = new URI("/gk/getVisit/" + visit.getId());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        assert uri != null;
        return ResponseEntity.created(uri).body(visit);
    }
}
