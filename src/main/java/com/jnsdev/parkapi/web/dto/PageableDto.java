package com.jnsdev.parkapi.web.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Autor Jairo Nascimento
 * @Created 03/09/2023 - 09:06
 */

@Getter @Setter
public class PageableDto {

    private List content = new ArrayList();
    private boolean first;
    private boolean last;
    @JsonProperty("page")
    private int number;
    private int size;
    @JsonProperty("pageElements")
    private int numberOfElements;
    private int totalPages;
    private int totalElements;
}
