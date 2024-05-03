package com.challenge.loans.rest.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PersonRequest {

    @NotNull(message = "Age mandatory")
    @Positive(message = "Invalid age")
    private int age;

    @CPF(message = "Invalid CPF")
    @NotNull(message = "CPF mandatory")
    private String cpf;

    @NotBlank(message = "Name mandatory")
    private String name;

    @NotNull(message = "Income mandatory")
    @Positive(message = "Invalid income")
    private double income;

    @NotBlank(message = "Location mandatory")
    private String location;

}
