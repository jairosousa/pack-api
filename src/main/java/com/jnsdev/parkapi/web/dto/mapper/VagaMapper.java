package com.jnsdev.parkapi.web.dto.mapper;

import com.jnsdev.parkapi.entity.Vaga;
import com.jnsdev.parkapi.web.dto.VagaCreateDto;
import com.jnsdev.parkapi.web.dto.VagaResponseDto;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

/**
 * @Autor Jairo Nascimento
 * @Created 03/09/2023 - 17:01
 */

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class VagaMapper {

    public static Vaga toVaga(VagaCreateDto dto) {
        return new ModelMapper().map(dto, Vaga.class);
    }

    public static VagaResponseDto toDto(Vaga vaga) {
        return new ModelMapper().map(vaga, VagaResponseDto.class);
    }
}
