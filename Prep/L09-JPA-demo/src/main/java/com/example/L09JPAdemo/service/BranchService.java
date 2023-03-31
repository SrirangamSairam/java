package com.example.L09JPAdemo.service;

import com.example.L09JPAdemo.entity.Branch;
import com.example.L09JPAdemo.repo.IBranchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BranchService {
    
    @Autowired
    private IBranchRepo branchRepo;

    public Branch createBranch(Branch branch) {
        branchRepo.save(branch);
        return branch;
    }

    public Branch getBranchById(int id) {
        return branchRepo.findById(id).get();
    }

//    public Set<Employee> getEmployeeByBranchId(int id) {
//        return branchRepo.findEmployeeByBranchId(id);
//    }
}
