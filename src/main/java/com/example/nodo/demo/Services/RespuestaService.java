package com.example.nodo.demo.Services;

import com.example.nodo.demo.Models.Respuestas;
import com.example.nodo.demo.Repositories.RespuestasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class RespuestaService {
    @Autowired
    private RespuestasRepository respuestaRepository;

    public Respuestas create(Respuestas respuesta){
        return respuestaRepository.save(respuesta);
    }

    public List<Respuestas> findAll() {
        return respuestaRepository.findAll();
        }

    public Optional<Respuestas> findById(Integer id) {
        return respuestaRepository.findById(id);
        }

    public void deleteById(Integer id) {
        respuestaRepository.deleteById(id);
    }
}
