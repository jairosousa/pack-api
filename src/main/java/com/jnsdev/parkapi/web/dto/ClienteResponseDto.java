package com.jnsdev.parkapi.web.dto;

import lombok.*;

/**
 * @Autor Jairo Nascimento
 * @Created 02/09/2023 - 07:44
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ClienteResponseDto {

    private Long id;
    private String nome;
    private String cpf;
}
