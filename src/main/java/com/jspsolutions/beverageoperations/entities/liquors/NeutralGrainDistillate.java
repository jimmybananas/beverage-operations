package com.jspsolutions.beverageoperations.entities.liquors;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class NeutralGrainDistillate extends Liquor{

    @Enumerated(EnumType.STRING)
    @NotBlank(message = "Base Grain cannot be blank")
    private VodkaBase vodkaBase;

    @Column(nullable = false)
    @NotBlank(message = "Age cannot be blank")
    private int age;

}
