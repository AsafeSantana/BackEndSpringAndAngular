package br.com.api_spring_angular.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.api_spring_angular.api.model.Cliente;
import br.com.api_spring_angular.api.repository.Repository;

@RestController
@CrossOrigin(origins = "*")
public class Controle {

    @Autowired
    private Repository acao;

    @PostMapping("/")
    public Cliente cadastrar(@RequestBody Cliente c){
        return acao.save(c);
    }
    
    @GetMapping("/")
    public Iterable<Cliente> selecionar(){
        return acao.findAll();
    }

    @PutMapping("/")
    public Cliente editar(@RequestBody Cliente c){
        return acao.save(c);
    }

    @DeleteMapping("/{codigo}") 
    public void remover(@PathVariable long codigo){
        acao.deleteById(codigo);
        
    }

}
