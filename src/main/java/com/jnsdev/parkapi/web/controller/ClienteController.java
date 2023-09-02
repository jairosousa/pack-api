package com.jnsdev.parkapi.web.controller;

import com.jnsdev.parkapi.entity.Cliente;
import com.jnsdev.parkapi.jwt.JwtUserDetails;
import com.jnsdev.parkapi.service.ClienteService;
import com.jnsdev.parkapi.service.UsuarioService;
import com.jnsdev.parkapi.web.dto.ClienteCreateDto;
import com.jnsdev.parkapi.web.dto.ClienteResponseDto;
import com.jnsdev.parkapi.web.dto.mapper.ClienteMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Autor Jairo Nascimento
 * @Created 02/09/2023 - 17:22
 */

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/clientes")
public class ClienteController {

    private final ClienteService clienteService;
    private final UsuarioService usuarioService;

    @PostMapping
    @PreAuthorize("hasRole('CLIENTE')")
    public ResponseEntity<ClienteResponseDto> create(@Valid @RequestBody ClienteCreateDto dto,
                                                     @AuthenticationPrincipal JwtUserDetails userDetails) {
        Cliente cliente = ClienteMapper.toCliente(dto);
        cliente.setUsuario(usuarioService.buscarPorId(userDetails.getId()));
        clienteService.salvar(cliente);

        return ResponseEntity.status(201).body(ClienteMapper.toDTO(cliente));

    }
}
