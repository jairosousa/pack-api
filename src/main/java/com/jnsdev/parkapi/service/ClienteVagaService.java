package com.jnsdev.parkapi.service;

import com.jnsdev.parkapi.entity.ClienteVaga;
import com.jnsdev.parkapi.exception.EntityNotFoundException;
import com.jnsdev.parkapi.repository.ClienteVagaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Autor Jairo Nascimento
 * @Created 04/09/2023 - 19:51
 */

@RequiredArgsConstructor
@Service
public class ClienteVagaService {

    private final ClienteVagaRepository repository;

    @Transactional
    public ClienteVaga salvar(ClienteVaga clienteVaga) {
        return repository.save(clienteVaga);
    }

    @Transactional(readOnly = true)
    public ClienteVaga buscarPorRecibo(String recibo) {
        return repository.findByReciboAndDataSaidaIsNull(recibo).orElseThrow(
                () -> new EntityNotFoundException(
                        String.format("Recibo '%s' não encontrado no sistema ou check-out já realizado", recibo)
                )
        );
    }
}
