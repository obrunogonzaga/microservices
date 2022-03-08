package com.alura.microservices.loja.controller.dto;

import lombok.Data;

import java.util.List;

@Data
public class CompraDTO {
    private List<ItemDeCompraDTO> itens;
    private EnderecoDTO endereco;
}
