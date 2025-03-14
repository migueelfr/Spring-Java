package com.example.demo.controller;

import com.example.demo.model.Contato;
import com.example.demo.repository.ContatoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Contatos")
public class ContatoController {
    private final ContatoRepository repository;

    public ContatoController(ContatoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Contato> listarContatos() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Contato buscarContato(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PostMapping
    public Contato adicionarContato(@RequestBody Contato Contato) {
        return repository.save(Contato);
    }

    @PutMapping("/{id}")
    public Contato atualizarContato(@PathVariable Long id, @RequestBody Contato ContatoAtualizado) {
        Optional<Contato> Contato = repository.findById(id);
        if (Contato.isPresent()) {
            Contato c = Contato.get();
            c.setNome(ContatoAtualizado.getNome());
            c.setTelefone(ContatoAtualizado.getTelefone());
            c.setTelefone(ContatoAtualizado.getTelefone());
            return c;
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletarContato(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
