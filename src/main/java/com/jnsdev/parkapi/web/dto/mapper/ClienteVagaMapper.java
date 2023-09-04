package com.jnsdev.parkapi.web.dto.mapper;

import com.jnsdev.parkapi.entity.ClienteVaga;
import com.jnsdev.parkapi.web.dto.EstacionamentoCreateDto;
import com.jnsdev.parkapi.web.dto.EstacionamentoResponseDto;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

/**
 * @Autor Jairo Nascimento
 * @Created 04/09/2023 - 19:43
 */

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ClienteVagaMapper {

    public static ClienteVaga toClienteVaga(EstacionamentoCreateDto dto) {
        return new ModelMapper().map(dto, ClienteVaga.class);
    }

    public static EstacionamentoResponseDto toDto(ClienteVaga clienteVaga) {
        return new ModelMapper().map(clienteVaga, EstacionamentoResponseDto.class);
    }
}
