package com.jspsolutions.beverageoperations.entities.liquors;

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
public class NeutralGrainDistillate extends Liquor{

    @Enumerated(EnumType.STRING)
    private VodkaBase vodkaBase;

    @Column(nullable = false)
    private int age;

}
