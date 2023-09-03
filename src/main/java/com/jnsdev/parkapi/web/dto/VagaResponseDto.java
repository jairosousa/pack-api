package com.jnsdev.parkapi.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @Autor Jairo Nascimento
 * @Created 03/09/2023 - 17:00
 */

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class VagaResponseDto {
    private Long id;
    private String codigo;
    private String status;
}
