package com.example.L11minorprojectone.repos;

import com.example.L11minorprojectone.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {
}
