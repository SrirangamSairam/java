package com.example.L09JPAdemo.service;

import com.example.L09JPAdemo.entity.Employee;
import com.example.L09JPAdemo.repo.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private IEmployeeRepo employeeRepo;

    public Employee createEmployee(Employee employee) {
        employeeRepo.save(employee);
        return employee;
    }
}
