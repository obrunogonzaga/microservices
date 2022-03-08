package com.alura.microservices.fornecedor.service;


import com.alura.microservices.fornecedor.model.InfoFornecedor;
import org.springframework.data.repository.CrudRepository;

public interface InfoRepository extends CrudRepository<InfoFornecedor, Long> {

    InfoFornecedor findByEstado(String estado);

}
