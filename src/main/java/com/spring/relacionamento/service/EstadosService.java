package com.spring.relacionamento.service;

import com.spring.relacionamento.model.Estado;
import com.spring.relacionamento.repository.IEstadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadosService {

    @Autowired
    private IEstadosRepository repository;

    public List<Estado> buscarTodos(){
        return repository.findAll();
    }
    public Optional<Estado> burcarId(Integer id){
        return repository.findById(id);
    }
    public Estado cadastrar(Estado estado){
        return repository.save(estado);
    }
    public Estado alterar(Estado estado){
        return repository.save(estado);
    }
    public void deletar(Integer id){
        repository.deleteById(id);
    }
}
