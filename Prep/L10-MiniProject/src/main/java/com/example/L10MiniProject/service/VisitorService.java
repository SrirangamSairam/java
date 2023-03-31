package com.example.L10MiniProject.service;

import com.example.L10MiniProject.entity.Visitor;
import com.example.L10MiniProject.repository.VisitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisitorService {
    @Autowired
    private VisitorRepository visitorRepository;

    public Visitor createVisitor(Visitor visitor) {
        visitor = visitorRepository.save(visitor);
        return visitor;
    }
}
