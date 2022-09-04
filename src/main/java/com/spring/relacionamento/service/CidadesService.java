package com.spring.relacionamento.service;

import com.spring.relacionamento.model.Cidades;
import com.spring.relacionamento.repository.ICidadesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CidadesService {

    @Autowired
    private ICidadesRepository repository;

    public List<Cidades> buscarTodos(){
        return repository.findAll();
    }
    public Optional<Cidades> burcarId(Integer codigo){
        return repository.findById(codigo);
    }
    public Cidades cadastrar(Cidades cidade){
        return repository.save(cidade);
    }
    public Cidades alterar(Cidades cidade){
        return repository.save(cidade);
    }
    public void deletar(Integer id){
        repository.deleteById(id);
    }
}
