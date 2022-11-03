package com.example.L10springjpademo.controller;

import com.example.L10springjpademo.EmployeeService;
import com.example.L10springjpademo.entity.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private static Logger logger = LoggerFactory.getLogger(EmployeeController.class);
    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<Employee> getEmployeeById(@RequestParam int id) {
        Employee employee = employeeService.getEmployeeById(id);
        return ResponseEntity.ok(employee);
    }

    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) throws URISyntaxException {
        employee = employeeService.createEmployee(employee);
        URI location = new URI("/employee/"+employee.getId());
        return ResponseEntity.created(location).body(employee);
    }

    @PutMapping("/updateBranch")
    public ResponseEntity<Employee> updateEmployeeBranch(@RequestParam int id, int branchId) {
        Employee employee = employeeService.updateEmployeeBranch(id, branchId);
        return ResponseEntity.ok(employee);
    }

    @GetMapping("/test")
    private String testAnnotation() {
        long start = System.currentTimeMillis();
        String test = employeeService.testAnnotation();
        long end = System.currentTimeMillis();
        logger.info("Execution time is {}", end-start);
        return test;
    }
}
