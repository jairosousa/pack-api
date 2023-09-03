package com.jnsdev.parkapi.web.dto.mapper;

import com.jnsdev.parkapi.web.dto.PageableDto;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;

/**
 * @Autor Jairo Nascimento
 * @Created 03/09/2023 - 09:14
 */

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PageableMapper {

    public static PageableDto toDto(Page page) {
        return new ModelMapper().map(page, PageableDto.class);
    }
}
