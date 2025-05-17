package com.jspsolutions.beverageoperations.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
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
    @NotBlank(message = "Name cannot be empty")
    private String name;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @Column(nullable = false)
    @NotBlank(message = "City cannot be empty")
    private String city;

    @Column(nullable = false)
    @Min(value = 0, message = "Price must be positive")
    private double price;

    @Column(nullable = false)
    @Size(min = 10, message = "Tasting notes must be at least 10 characters")
    private String tastingNotes;
}
