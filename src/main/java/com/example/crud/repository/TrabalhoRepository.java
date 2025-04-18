package com.example.crud.repository;

import com.example.crud.entity.Trabalho;

import java.util.List;
import java.util.Optional;

public interface TrabalhoRepository {
    Optional<Object> findById(Long id);

    List<Trabalho> findAll();

    Trabalho save(Trabalho trabalho);

    void deleteById(Long id);
}