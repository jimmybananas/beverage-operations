package com.jspsolutions.beverageoperations.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "beverages")
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Beverage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private String tastingNotes;
}
