package com.jnsdev.parkapi.web.dto;

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

    private String username;
    private String password;
}
