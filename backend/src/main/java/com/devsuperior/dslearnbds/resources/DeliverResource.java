package com.devsuperior.dslearnbds.resources;

import com.devsuperior.dslearnbds.dto.DeliverReviewDTO;
import com.devsuperior.dslearnbds.dto.NotificationDTO;
import com.devsuperior.dslearnbds.services.DeliverService;
import com.devsuperior.dslearnbds.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/deliver")
public class DeliverResource {

    @Autowired
    private DeliverService service;


    @PutMapping(value="/{id}")
    public ResponseEntity<DeliverReviewDTO> saveRevision(@PathVariable Long id, @RequestBody DeliverReviewDTO dto) {
        dto =service.saveRevision(id,dto);
        return ResponseEntity.ok().body(dto);
    }
}
