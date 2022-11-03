package com.example.L10springjpademo;

import com.example.L10springjpademo.entity.Branch;
import com.example.L10springjpademo.entity.Employee;
import com.example.L10springjpademo.repo.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Service
public class EmployeeService {
    @Autowired
    private IEmployeeRepo employeeRepo;

    @Autowired
    private BranchService branchService;

    @Autowired
    private EntityManager entityManager;

    @Transactional
    public Employee createEmployee(Employee employee) {
        employeeRepo.save(employee);
        employee.setBranch(branchService.getBranchById(2));
        entityManager.flush();
        entityManager.detach(employee);
        employee.setBranch(branchService.getBranchById(1));
        return employee;
    }

    public Employee getEmployeeById(int id) {
        return employeeRepo.findById(id).get();
    }

    public Employee updateEmployeeBranch(int id, int branchId) {
        Employee employee = getEmployeeById(id);
        Branch branch = branchService.getBranchById(branchId);
        employee.setBranch(branch);
        employeeRepo.save(employee);
        return employee;
    }

    public String testAnnotation() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "Hello by " + Thread.currentThread().getName();
    }
}
