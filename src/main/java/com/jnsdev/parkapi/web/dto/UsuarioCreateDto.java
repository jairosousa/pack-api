package com.jnsdev.parkapi.web.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

/**
 * @Autor Jairo Nascimento
 * @Created 28/08/2023 - 15:10
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UsuarioCreateDto {

    @NotBlank
    @Email(regexp = "^[a-z0-9.+-]+@[a-z0-9.-]+\\.[a-z]{2,}$", message = "Formato email está invalido")
    private String username;

    @NotBlank
    @Size(min = 6, max = 6)
    private String password;
}
