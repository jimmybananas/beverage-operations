package com.jspsolutions.beverageoperations.entities.liquors;

import com.jspsolutions.beverageoperations.entities.Beverage;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Liquor extends Beverage {

    @Column(nullable = false)
    private double ounces;

    @Column(nullable = false)
    private double proof;



}
