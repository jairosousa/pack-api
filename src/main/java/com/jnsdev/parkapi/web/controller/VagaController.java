package com.jnsdev.parkapi.web.controller;

import com.jnsdev.parkapi.entity.Vaga;
import com.jnsdev.parkapi.service.VagaService;
import com.jnsdev.parkapi.web.dto.VagaCreateDto;
import com.jnsdev.parkapi.web.dto.VagaResponseDto;
import com.jnsdev.parkapi.web.dto.mapper.VagaMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.headers.Header;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

/**
 * @Autor Jairo Nascimento
 * @Created 03/09/2023 - 17:09
 */

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/vagas")
public class VagaController {

    private final VagaService vagaService;

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Void> create(@RequestBody @Valid VagaCreateDto dto) {
        Vaga vaga = VagaMapper.toVaga(dto);
        vagaService.salvar(vaga);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequestUri().path("/{codigo}")
                .buildAndExpand(vaga.getCodigo())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @GetMapping("/{codigo}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<VagaResponseDto> getByCodigo(@PathVariable String codigo) {
        Vaga vaga = vagaService.buscarPorCodigo(codigo);
        return ResponseEntity.ok(VagaMapper.toDto(vaga));
    }
}
