package com.jnsdev.parkapi.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * @Autor Jairo Nascimento
 * @Created 04/09/2023 - 19:45
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class EstacionamentoUtils {

    // 2023-03-16T15:23:48.616463500
    // 20230316-152121
    public static String gerarRecibo() {
        LocalDateTime date = LocalDateTime.now();
        String recibo = date.toString().substring(0,19);
        return recibo.replace("-", "")
                .replace(":", "")
                .replace("T", "-");
    }
}
