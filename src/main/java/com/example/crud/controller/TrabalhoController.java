package com.example.crud.controller;

import com.example.crud.entity.Trabalho;
import com.example.crud.repository.TrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trabalhos")
public class TrabalhoController {

    @Autowired
    private TrabalhoRepository trabalhoRepository;

    @GetMapping
    public List<Trabalho> listar() {
        return trabalhoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Trabalho buscar(@PathVariable Long id) {
        return (Trabalho) trabalhoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Trabalho não encontrado"));
    }

    @PostMapping
    public Trabalho criar(@RequestBody Trabalho trabalho) {
        return trabalhoRepository.save(trabalho);
    }

    @PutMapping("/{id}")
    public Trabalho atualizar(@PathVariable Long id, @RequestBody Trabalho novoTrabalho) {
        Trabalho t = (Trabalho) trabalhoRepository.findById(id).orElseThrow(() -> new RuntimeException("Trabalho não encontrado"));
        t.setEmpresa(novoTrabalho.getEmpresa());
        t.setCargo(novoTrabalho.getCargo());
        return trabalhoRepository.save(t);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        trabalhoRepository.deleteById(id);
    }
}