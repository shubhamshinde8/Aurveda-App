package com.example.ayurveda.service;

import com.example.ayurveda.model.Service;
import com.example.ayurveda.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServiceService {

    @Autowired
    private ServiceRepository serviceRepository;

    public List<Service> getAllServices(){
        return serviceRepository.findAll();
    }

    public Service addService(Service service){
        return serviceRepository.save(service);
    }


}
