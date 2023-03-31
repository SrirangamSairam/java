package com.example.L10MiniProject.controller;

import com.example.L10MiniProject.entity.Visit;
import com.example.L10MiniProject.entity.Visitor;
import com.example.L10MiniProject.service.VisitService;
import com.example.L10MiniProject.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/gk")
public class GateKeeperController {
    @Autowired
    private VisitorService visitorService;

    @Autowired
    private VisitService visitService;

    @PostMapping("/createVisitor")
    public ResponseEntity<Visitor> createVisitor(@RequestBody Visitor visitor){
        visitor = visitorService.createVisitor(visitor);
        URI uri = null;
        try {
            uri = new URI("/gk/getVisitor/" + visitor.getId());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        assert uri != null;
        return ResponseEntity.created(uri).body(visitor);
    }

    @PostMapping("/createNewVisit")
    public ResponseEntity<Visit> createNewVisit(@RequestBody Visit visit) {
        visit = visitService.createVisit(visit);
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
