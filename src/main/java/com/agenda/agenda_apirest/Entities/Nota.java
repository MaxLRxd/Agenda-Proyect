package com.agenda.agenda_apirest.Entities;
import jakarta.persistence.*;
@Entity
public class Nota {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    @Column(length = 1000)
    private String texto;
    private int mes;
    private int dia;
    @ManyToOne
    @JoinColumn(name = "contacto_id")
    private Contacto contacto;
    // getters y setters
    public void setId(Long id2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setId'");
    }
}