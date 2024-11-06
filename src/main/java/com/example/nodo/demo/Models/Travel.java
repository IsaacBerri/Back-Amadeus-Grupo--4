package com.example.nodo.demo.Travel.Models;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Travel {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Integer Travel_id;
    public String Travel_value;
}
