package com.example.nodo.demo.Controllers;

import com.example.nodo.demo.Models.Respuestas;
import com.example.nodo.demo.Services.RespuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class RespuestaController {

    @Autowired
    private RespuestaService respuestaService;

    @GetMapping("/respuestas")
    public List<Respuestas> findAll() {return respuestaService.findAll();}

    @GetMapping("/respuesta/{id}")
        public Respuestas getById(@PathVariable Integer id) {
        Optional<Respuestas> respuesta = respuestaService.findById(id);
        return respuesta.orElse(null);
    }

    @PostMapping("/respuesta")
        public Respuestas create(@RequestBody Respuestas respuesta) {
        return respuestaService.create(respuesta);
    }
    @DeleteMapping("/respuesta/{id}")
        public void delete(@PathVariable Integer id) {
        respuestaService.deleteById(id);
    }

}
