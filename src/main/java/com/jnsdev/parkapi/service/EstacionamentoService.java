package com.jnsdev.parkapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Autor Jairo Nascimento
 * @Created 04/09/2023 - 19:52
 */

@RequiredArgsConstructor
@Service
public class EstacionamentoService {

    private final ClienteVagaService clienteVagaService;
    private final ClienteService clienteService;
    private final VagaService vagaService;
}
