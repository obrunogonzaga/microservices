package com.alura.microservices.loja.service;

import com.alura.microservices.loja.controller.dto.CompraDTO;
import com.alura.microservices.loja.controller.dto.InfoFornecedorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CompraService {

    @Autowired
    private RestTemplate client;

    public void realizaCompra(CompraDTO compra) {
        ResponseEntity<InfoFornecedorDTO> responseEntity =
                client.exchange("http://fornecedor/info/" + compra.getEndereco().getEstado(),
                HttpMethod.GET, null, InfoFornecedorDTO.class);

        System.out.println(responseEntity.getBody().getEndereco());
    }

}

