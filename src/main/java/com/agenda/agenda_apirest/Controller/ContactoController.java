package com.agenda.agenda_apirest.Controller;
import com.agenda.agenda_apirest.Entities.Contacto;
import com.agenda.agenda_apirest.Repositories.ContactoRepository;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/contactos")
public class ContactoController {

    private final ContactoRepository repo;
    public ContactoController(ContactoRepository repo) { this.repo = repo; }

    @GetMapping
    public List<Contacto> getAll() { return repo.findAll(); }

    @PostMapping
    public Contacto create(@RequestBody Contacto c) { return repo.save(c); }

    @GetMapping("/{id}")
    public Contacto getById(@PathVariable Long id) { return repo.findById(id)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Contacto no encontrado"));
    }

    @PutMapping("/{id}")
    public Contacto update(@PathVariable Long id, @RequestBody Contacto c) {
        c.setId(id);
        return repo.save(c);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { repo.deleteById(id); }
}
