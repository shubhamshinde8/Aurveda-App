package com.example.ayurveda.controller;

import com.example.ayurveda.model.Service;
import com.example.ayurveda.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class ServiceController {

    @Autowired
    private ServiceService serviceService;

    @GetMapping
    public ResponseEntity<List<Service>> getAllServices() {
        return ResponseEntity.ok(serviceService.getAllServices());
    }

    @PostMapping
    public ResponseEntity<Service> addService(@RequestBody Service service) {
        return ResponseEntity.ok(serviceService.addService(service));
    }
}
