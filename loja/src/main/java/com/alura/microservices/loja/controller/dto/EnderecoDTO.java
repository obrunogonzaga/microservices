package com.alura.microservices.loja.controller.dto;

import lombok.Data;

@Data
public class EnderecoDTO {
    private String rua;
    private int numero;
    private String estado;
}
