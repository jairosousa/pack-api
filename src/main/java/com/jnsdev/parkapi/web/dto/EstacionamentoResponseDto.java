package com.jnsdev.parkapi.web.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @Autor Jairo Nascimento
 * @Created 04/09/2023 - 19:41
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EstacionamentoResponseDto {
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private String clienteCpf;
    private String recibo;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime dataEntrada;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime dataSaida;
    private String vagaCodigo;
    private BigDecimal valor;
    private BigDecimal desconto;
}
