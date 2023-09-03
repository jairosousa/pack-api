package com.jnsdev.parkapi.service;

import com.jnsdev.parkapi.entity.Cliente;
import com.jnsdev.parkapi.exception.CpfUniqueViolationException;
import com.jnsdev.parkapi.exception.EntityNotFoundException;
import com.jnsdev.parkapi.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Autor Jairo Nascimento
 * @Created 02/09/2023 - 17:12
 */

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository clienteRepository;

    @Transactional
    public Cliente salvar(Cliente cliente) {
        try {
            return clienteRepository.save(cliente);
        } catch (DataIntegrityViolationException ex) {
            throw new CpfUniqueViolationException(
                    String.format("CPF '%s' não pode ser cadastrado, já existe no sistema.", cliente.getCpf()));
        }
    }

    @Transactional(readOnly = true)
    public Cliente buscarPorId(Long id) {
        return clienteRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException(String.format("Cliente id=%s não encontrado no sistema", id))
        );
    }

    @Transactional(readOnly = true)
    public Page<Cliente> buscarTodos(Pageable pageable) {
        return clienteRepository.findAll(pageable);
    }
}
