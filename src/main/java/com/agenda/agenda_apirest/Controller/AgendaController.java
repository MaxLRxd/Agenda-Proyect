package com.agenda.agenda_apirest.Controller;
import com.agenda.agenda_apirest.Entities.Agenda;
import com.agenda.agenda_apirest.Entities.Contacto;
import com.agenda.agenda_apirest.Repositories.AgendaRepository;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;

@RestController
@RequestMapping("/api/agendas")
public class AgendaController {
    private final AgendaRepository repositorio;
    public AgendaController(AgendaRepository repositorio){
        this.repositorio = repositorio;
    }

    @GetMapping
    public List<Agenda> getAll(){
        return repositorio.findAll();
    }

    @PostMapping("/{id}")
    public Agenda create(@RequestBody Agenda agenda){return repositorio.save(agenda);}

    @GetMapping("/{id}")
    public Agenda getById(@PathVariable Long Id){
        return repositorio.findById(Id)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Agenda no encontrado"));
    }

    @PutMapping("/{id}")
    public Agenda updateAgenda(@PathVariable Long id, @RequestBody Agenda agenda){
       Agenda agend = repositorio.findById(id)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "id no encontrado"));
        agend.setNombreAgenda(agenda.getNombreAgenda());
        agend.setNotas(agenda.getNotas());
        agenda.setId(id);
        return repositorio.save(agend);
    }

    @DeleteMapping("/{id}")
    public String deleteAgenda(@PathVariable Long id){
        repositorio.deleteById(id);
        return "eliminado correctamente";
    }
}
