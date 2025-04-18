package com.example.crud.repository;

import com.example.crud.entity.Pessoa;

import java.util.List;
import java.util.Optional;

public interface PessoaRepository {
    Optional<Object> findById(Long id);

    List<Pessoa> findAll();

    void deleteById(Long id);

    Pessoa save(Pessoa pessoa);
}