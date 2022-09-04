package com.spring.relacionamento.controller;

import com.spring.relacionamento.model.Estado;
import com.spring.relacionamento.service.EstadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EstadosController {

    @Autowired
    private EstadosService service;

    @GetMapping(path = "/estados")
    public ResponseEntity<List<Estado>>buscarTodosEstados(){
     return ResponseEntity.ok(service.buscarTodos());
    }
    @GetMapping(path = "/estados/{id}")
    public ResponseEntity<Optional<Estado>>buscarEstadoPorId(@PathVariable Integer id){
        return ResponseEntity.ok(service.burcarId(id));
    }
    @PostMapping(path = "/estados")
    public ResponseEntity<Estado>cadastrarEstado(@RequestBody Estado estado){
        return ResponseEntity.ok(service.cadastrar(estado));
    }
    @PutMapping(path = "/estados")
    public ResponseEntity<Estado>alterarEstado(@RequestBody Estado estado){
        return ResponseEntity.ok(service.cadastrar(estado));
    }
    @DeleteMapping(path = "/estados/{id}")
    public void deletarEstado(@PathVariable Integer id){
        service.deletar(id);
    }
}
