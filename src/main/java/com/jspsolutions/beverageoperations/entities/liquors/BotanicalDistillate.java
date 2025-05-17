package com.jspsolutions.beverageoperations.entities.liquors;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BotanicalDistillate extends Liquor{

    @Column(nullable = false)
    @NotBlank(message = "Botanical Type cannot be blank")
    private BotanicalType botanicalType;
}
