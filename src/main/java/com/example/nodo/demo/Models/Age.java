package com.example.nodo.demo.Age.Models;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Age {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Integer Age_id;
    public String Age_value;
}