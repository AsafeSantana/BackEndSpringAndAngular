package br.com.api_spring_angular.api.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.api_spring_angular.api.model.Cliente;

public interface Repository extends CrudRepository<Cliente, Long> {
    
}
