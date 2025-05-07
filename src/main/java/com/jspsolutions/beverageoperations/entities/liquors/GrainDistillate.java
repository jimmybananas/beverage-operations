package com.jspsolutions.beverageoperations.entities.liquors;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GrainDistillate extends Liquor{

    @Column(nullable = false)
    private int age;

}
