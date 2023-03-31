package com.example.L10MiniProject.service;

import com.example.L10MiniProject.dto.VisitStatus;
import com.example.L10MiniProject.entity.Visit;
import com.example.L10MiniProject.repository.VisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisitService {
    @Autowired
    private VisitRepository visitRepository;

//    private EntityManager entityManager;
//
//    VisitService(EntityManager entityManager) {
//        this.entityManager = entityManager;
//    }

    public Visit createVisit(Visit visit) {
        visit = visitRepository.save(visit);
        return visit;
    }

    public Visit updateVisitStatus(int id, VisitStatus visitStatus) {
//        Visit visit = entityManager.find(Visit.class,id);
//        Visit visit = entityManager.find(Visit.class,id);
        Visit visit = visitRepository.findById(id).get();
        visit.setStatus(visitStatus);
//        entityManager.persist(visit);
        visitRepository.save(visit);
        return visit;
    }
}
