package com.example.ayurveda.repository;

import com.example.ayurveda.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service,Long> {
}
