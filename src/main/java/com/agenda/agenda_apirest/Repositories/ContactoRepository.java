package com.agenda.agenda_apirest.Repositories;
import com.agenda.agenda_apirest.Entities.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactoRepository extends JpaRepository<Contacto, Long> {}