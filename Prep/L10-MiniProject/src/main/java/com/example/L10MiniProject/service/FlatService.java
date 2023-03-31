package com.example.L10MiniProject.service;

import com.example.L10MiniProject.entity.Flat;
import com.example.L10MiniProject.repository.FlatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlatService {
    @Autowired
    private FlatRepository flatRepository;

    public Flat createFlat(Flat flat) {
        flat = flatRepository.save(flat);
        return flat;
    }
}
