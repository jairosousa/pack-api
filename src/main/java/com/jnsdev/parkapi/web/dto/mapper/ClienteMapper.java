package com.jnsdev.parkapi.web.dto.mapper;

import com.jnsdev.parkapi.entity.Cliente;
import com.jnsdev.parkapi.entity.Usuario;
import com.jnsdev.parkapi.web.dto.ClienteCreateDto;
import com.jnsdev.parkapi.web.dto.ClienteResponseDto;
import com.jnsdev.parkapi.web.dto.UsuarioResponseDto;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Autor Jairo Nascimento
 * @Created 02/09/2023 - 07:44
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ClienteMapper {

    public static Cliente toCliente(ClienteCreateDto dto) {
        return new ModelMapper().map(dto, Cliente.class);
    }

    public static ClienteResponseDto toDTO(Cliente cliente) {
        return new ModelMapper().map(cliente, ClienteResponseDto.class);
    }

}
