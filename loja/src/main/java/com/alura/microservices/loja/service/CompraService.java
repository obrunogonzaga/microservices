package com.alura.microservices.loja.service;

import com.alura.microservices.loja.controller.dto.CompraDTO;
import com.alura.microservices.loja.controller.dto.InfoFornecedorDTO;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CompraService {

    public void realizaCompra(CompraDTO compra) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<InfoFornecedorDTO> responseEntity =
                restTemplate.exchange("http://localhost:8081/info/" + compra.getEndereco().getEstado(),
                HttpMethod.GET, null, InfoFornecedorDTO.class);

        System.out.println(responseEntity.getBody().getEndereco());
    }

}

