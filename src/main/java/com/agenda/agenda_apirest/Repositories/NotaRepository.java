package com.agenda.agenda_apirest.Repositories;
import com.agenda.agenda_apirest.Entities.Nota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotaRepository extends JpaRepository<Nota, Long> {}
