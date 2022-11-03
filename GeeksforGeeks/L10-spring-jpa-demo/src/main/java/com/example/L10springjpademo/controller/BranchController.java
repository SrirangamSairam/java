package com.example.L10springjpademo.controller;

import com.example.L10springjpademo.BranchService;
import com.example.L10springjpademo.entity.Branch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/branch")
public class BranchController {

    @Autowired
    private BranchService branchService;

    @GetMapping("/{id}")
    public ResponseEntity<Branch> getBranchById(@PathVariable int id) {
        Branch branch = branchService.getBranchById(id);
        return ResponseEntity.ok(branch);
    }

    @PostMapping
    public ResponseEntity<Branch> createBranch(@RequestBody Branch branch) throws URISyntaxException {
        branch = branchService.createBranch(branch);
        URI location = new URI("/branch"+branch.getId());
        return ResponseEntity.created(location).body(branch);
    }
}
