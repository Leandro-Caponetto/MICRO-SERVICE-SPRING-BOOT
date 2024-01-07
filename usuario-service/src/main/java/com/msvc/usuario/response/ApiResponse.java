package com.msvc.usuario.response;

import lombok.*;
import org.springframework.http.HttpStatus;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiResponse {

    private String mensage;
    private boolean success;
    private HttpStatus status;
}
