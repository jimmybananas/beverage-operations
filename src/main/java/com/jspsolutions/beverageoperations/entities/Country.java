package com.jspsolutions.beverageoperations.entities;

import jakarta.persistence.*;

@Entity
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 2)
    private String countryCode;

    @Column(nullable = false)
    private String name;
}
