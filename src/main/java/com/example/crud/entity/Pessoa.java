package com.example.crud.entity;

import java.util.List;

public class Pessoa {

    private Long id;

    private String nome;
    private Integer idade;

    private List<Trabalho> trabalhos;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Integer getIdade() { return idade; }
    public void setIdade(Integer idade) { this.idade = idade; }

    public List<Trabalho> getTrabalhos() { return trabalhos; }
    public void setTrabalhos(List<Trabalho> trabalhos) {
        this.trabalhos = trabalhos;
        if (trabalhos != null) {
            trabalhos.forEach(t -> t.setPessoa(this));
        }
    }
}