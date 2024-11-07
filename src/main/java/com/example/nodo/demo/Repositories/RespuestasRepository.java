package com.example.nodo.demo.Repositories;

import com.example.nodo.demo.Models.Respuestas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespuestasRepository extends JpaRepository<Respuestas, Integer> {
}
