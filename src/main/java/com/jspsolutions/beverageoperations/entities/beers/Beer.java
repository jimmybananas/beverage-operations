package com.jspsolutions.beverageoperations.entities.beers;

import com.jspsolutions.beverageoperations.entities.Beverage;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

@Entity
@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Beer extends Beverage {

    @Enumerated(EnumType.STRING)
    private BeerType beerType;

    @Column(nullable = false)
    private double alcoholByVolume;



}
