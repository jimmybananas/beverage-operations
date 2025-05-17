package com.jspsolutions.beverageoperations.entities.liquors;

import com.jspsolutions.beverageoperations.entities.Beverage;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Liquor extends Beverage {

    @Column(nullable = false)
    @NotBlank(message = "Brand cannot be blank")
    private String brand;

    @Column(nullable = false)
    @NotBlank(message = "Ounces cannot be blank")
    private double ounces;

    @Column(nullable = false)
    @NotBlank(message = "Price per Ounce cannot be blank")
    private double pricePerOunce;

    @Column(nullable = false)
    @NotBlank(message = "Proof cannot be blank")
    private double proof;



}
