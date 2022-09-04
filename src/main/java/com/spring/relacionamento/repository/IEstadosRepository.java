package com.spring.relacionamento.repository;

import com.spring.relacionamento.model.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstadosRepository extends JpaRepository<Estado,Integer> {
}
