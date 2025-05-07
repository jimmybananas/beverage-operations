package com.jspsolutions.beverageoperations.entities.wines;

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
public class Wine extends Beverage {

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private WineType wineType;

    @Column(nullable = false)
    private String Varietal;

    @Column(nullable = true)
    private String subRegion;

    @Column(nullable = false)
    private String wineryName;

    @Column(nullable = false)
    private String vintage;
}
