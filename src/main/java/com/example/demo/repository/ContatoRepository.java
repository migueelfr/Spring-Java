package com.example.demo.repository;

import com.example.demo.model.Contato;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContatoRepository {
    private List<Contato> contatos = new ArrayList<>();
    private Long idCounter = 1L;

    public List<Contato> findAll() { return contatos; }

    public Optional<Contato> findById(Long id) {
        return contatos.stream().filter(c -> c.getId().equals(id)).findFirst();
    }

    public Contato save(Contato contato) {
        contato.setId(idCounter++);
        contatos.add(contato);
        return contato;
    }

    public void deleteById(Long id) {
        contatos.removeIf(c -> c.getId().equals(id));
    }
}
