package com.example.L09JPAdemo.controller;

import com.example.L09JPAdemo.entity.Branch;
import com.example.L09JPAdemo.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/branch")
public class BranchController {

    @Autowired
    private BranchService branchService;

    @PostMapping
    public ResponseEntity<Branch> createBranch(@RequestBody Branch branch) {
        branch = branchService.createBranch(branch);
        return ResponseEntity.ok(branch);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Branch> getBranchById(@PathVariable int id) {
        Branch branch = branchService.getBranchById(id);
        return ResponseEntity.ok(branch);
    }

//    @GetMapping("/getEmployeeByBranchId")
//    public Set<Employee> getEmployees(@PathVariable int id) {
//        return branchService.getEmployeeByBranchId(id);
//    }
}
