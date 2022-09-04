package com.spring.relacionamento.controller;

import com.spring.relacionamento.model.Cidades;
import com.spring.relacionamento.service.CidadesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CidadesController {

    @Autowired
    private CidadesService service;

    @GetMapping(path = "/cidades")
    public ResponseEntity<List<Cidades>>buscarTodasCidades(){
     return ResponseEntity.ok(service.buscarTodos());
    }
    @GetMapping(path = "/cidades/{id}")
    public ResponseEntity<Optional<Cidades>>buscarCidadePorId(@PathVariable Integer codigo){
        return ResponseEntity.ok(service.burcarId(codigo));
    }
    @PostMapping(path = "/cidades")
    public ResponseEntity<Cidades>cadastrarCidade(@RequestBody Cidades cidade){
        return ResponseEntity.ok(service.cadastrar(cidade));
    }
    @PutMapping(path = "/cidades")
    public ResponseEntity<Cidades>alterarCidade(@RequestBody Cidades cidade){
        return ResponseEntity.ok(service.cadastrar(cidade));
    }
    @DeleteMapping(path = "/cidades/{id}")
    public void deletarCidade(@PathVariable Integer codigo){
        service.deletar(codigo);
    }
}
