package com.example.nodo.demo.Models;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Respuestas {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer Respuestas_ID;
}
