package com.example.demo.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // To mówi Springowi: "Zrób z tej klasy tabelę w bazie"
@Table(name = "tasks") // Opcjonalne: nazwa tabeli w bazie danych
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TestEntity {

    @Id // Klucz główny
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-inkrementacja (Serial w Postgres)
    private Long id;

    private String description;

    private boolean completed;
}
