package com.example.L10springjpademo.repo;

import com.example.L10springjpademo.entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBranchRepo extends JpaRepository<Branch, Integer> {
}
