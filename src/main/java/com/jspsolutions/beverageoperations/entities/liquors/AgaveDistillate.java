package com.jspsolutions.beverageoperations.entities.liquors;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AgaveDistillate extends Liquor{



    @Enumerated(EnumType.STRING)
    @NotBlank(message = "Agave Type cannot be blank")
    private AgaveType type;

    @Column(nullable = false)
    @NotBlank(message = "Varietal cannot be blank")
    private String varietal;

    @Column(nullable = false)
    @NotBlank(message = "Agave Age Statement cannot be blank")
    private AgaveAge agaveAge;


}
