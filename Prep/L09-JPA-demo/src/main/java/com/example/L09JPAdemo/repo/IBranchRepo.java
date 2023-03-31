package com.example.L09JPAdemo.repo;

import com.example.L09JPAdemo.entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBranchRepo extends JpaRepository<Branch, Integer> {

//    Set<Employee> findEmployeeByBranchId(int id);
}
