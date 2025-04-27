package com.agenda.agenda_apirest.Entities;
import jakarta.persistence.*;

@Entity
public class Contacto {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String localidad;
    private String direccion;
    private String telefono;
    // getters y setters
    public void setId(Long id2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setId'");
    }
}