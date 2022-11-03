package com.example.L11minorprojectone.repos;

import com.example.L11minorprojectone.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
