package com.jnsdev.parkapi.web.dto;

import lombok.*;

/**
 * @Autor Jairo Nascimento
 * @Created 28/08/2023 - 15:36
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UsuarioSenhaDto {
    private String senhaAtual;
    private String novaSenha;
    private String confirmaSenha;

}
