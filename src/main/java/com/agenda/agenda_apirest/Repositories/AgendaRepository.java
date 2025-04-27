package com.agenda.agenda_apirest.Repositories;
import com.agenda.agenda_apirest.Entities.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendaRepository extends JpaRepository<Agenda, Long> {}
