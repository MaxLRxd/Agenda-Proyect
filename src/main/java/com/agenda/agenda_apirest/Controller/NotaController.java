package com.agenda.agenda_apirest.Controller;
import com.agenda.agenda_apirest.Entities.Nota;
import com.agenda.agenda_apirest.Repositories.NotaRepository;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/notas")
public class NotaController {

    private final NotaRepository repo;
    public NotaController(NotaRepository repo) { this.repo = repo; }

    @GetMapping
    public List<Nota> getAll() { return repo.findAll(); }

    @PostMapping
    public Nota create(@RequestBody Nota n) { return repo.save(n); }

    @GetMapping("/{id}")
    public Nota getById(@PathVariable Long id) { return repo.findById(id)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Nota no encontrada")); }

    @PutMapping("/{id}")
    public Nota update(@PathVariable Long id, @RequestBody Nota n) {
        n.setId(id);
        return repo.save(n);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { repo.deleteById(id); }
}