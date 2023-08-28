package com.jnsdev.parkapi.service;

import com.jnsdev.parkapi.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Autor Jairo Nascimento
 * @Created 28/08/2023 - 06:44
 */

@RequiredArgsConstructor
@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
}
