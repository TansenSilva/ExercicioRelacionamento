package com.spring.relacionamento.repository;

import com.spring.relacionamento.model.Cidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICidadesRepository extends JpaRepository<Cidades,Integer> {
}
