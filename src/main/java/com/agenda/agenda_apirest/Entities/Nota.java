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
    @ManyToOne
    @JoinColumn(name = "agenda_id")
    private Agenda agenda;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public Contacto getContacto() {
        return contacto;
    }
    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }
}