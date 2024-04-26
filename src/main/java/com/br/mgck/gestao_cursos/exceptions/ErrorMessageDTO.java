package com.br.mgck.gestao_cursos.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorMessageDTO {
    private String errorMessage;
    private String field;
}
