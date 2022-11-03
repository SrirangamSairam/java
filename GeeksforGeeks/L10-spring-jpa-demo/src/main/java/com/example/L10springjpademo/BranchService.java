package com.example.L10springjpademo;

import com.example.L10springjpademo.entity.Branch;
import com.example.L10springjpademo.repo.IBranchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BranchService {
    @Autowired
    private IBranchRepo branchRepo;

    public Branch getBranchById(int id) {
        return branchRepo.findById(id).get();
    }

    public Branch createBranch(Branch branch) {
        branchRepo.save(branch);
        return branch;
    }
}
