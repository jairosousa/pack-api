package com.jnsdev.parkapi.web.dto;

import lombok.*;

/**
 * @Autor Jairo Nascimento
 * @Created 28/08/2023 - 15:17
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UsuarioResponseDto {

    private Long id;
    private String username;
    private String role;
}
