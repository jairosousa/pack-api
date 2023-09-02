package com.jnsdev.parkapi.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.validator.constraints.br.CPF;

/**
 * @Autor Jairo Nascimento
 * @Created 02/09/2023 - 07:40
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ClienteCreateDto {

    @NotBlank
    @Size(min = 5, max = 100)
    private String nome;

    @NotBlank
    @Size(min = 11, max = 11)
    @CPF
    private String cpf;
}
