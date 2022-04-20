package com.devsuperior.dslearnbds.services;

import com.devsuperior.dslearnbds.dto.DeliverReviewDTO;
import com.devsuperior.dslearnbds.entities.Deliver;
import com.devsuperior.dslearnbds.repositories.DeliverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeliverService {

    @Autowired
    private DeliverRepository repository;

    @Transactional
    @PreAuthorize("hasAnyRole('ADMIN','INSTRUCTOR')")
    public DeliverReviewDTO saveRevision(Long id, DeliverReviewDTO dto){
        Deliver deliver = repository.getOne(id);
        deliver.setStatus(dto.getStatus());
        deliver.setFeedback(dto.getFeedback());
        deliver.setCorrectCount(dto.getCorrectCount());
        deliver =repository.save(deliver);
        return new DeliverReviewDTO(deliver);
    }
}
