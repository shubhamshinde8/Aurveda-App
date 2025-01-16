package com.example.ayurveda.model;


import jakarta.persistence.*;

@Entity
@Table(name = "services")
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String description;
    private double price;

    @Column(name = "image_url")
    private String imageUrl;
}
