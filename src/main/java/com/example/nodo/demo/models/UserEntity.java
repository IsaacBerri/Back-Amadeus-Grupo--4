package com.example.nodo.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Getter
    private String name;
    private String email;

    //los datos relacionados no se cargarán automáticamente cuando se cargue la entidad UserEntity,
    // sino que se cargarán solo cuando se acceda explícitamente al campo respuesta.
    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "NumRespuesta", referencedColumnName = "id",
    // insertable = false, updatable = false)
    //private Respuestas respuesta;

    //private Integer NumRespuesta;
}
