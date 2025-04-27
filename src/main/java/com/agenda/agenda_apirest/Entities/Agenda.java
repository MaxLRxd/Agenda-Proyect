package com.agenda.agenda_apirest.Entities;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Agenda {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreAgenda;
    @OneToMany(mappedBy = "agenda", cascade = CascadeType.ALL, orphanRemoval=true)
    private List<Nota> notas = new ArrayList<>();;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombreAgenda() {
        return nombreAgenda;
    }
    public void setNombreAgenda(String nombreAgenda) {
        this.nombreAgenda = nombreAgenda;
    }
    public List<Nota> getNotas() {
        return notas;
    }
    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }
}