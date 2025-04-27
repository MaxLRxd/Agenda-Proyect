package com.agenda.agenda_apirest.Entities;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Agenda {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreAgenda;
    @OneToMany(mappedBy = "agenda", cascade = CascadeType.ALL)
    private List<Nota> notas;
    // getters y setters
}