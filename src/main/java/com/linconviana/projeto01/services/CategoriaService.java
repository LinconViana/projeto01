package com.linconviana.projeto01.services;

import com.linconviana.projeto01.domain.Categoria;
import com.linconviana.projeto01.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Optional<Categoria> buscar(Integer id){
        Optional<Categoria> obj = repo.findById(id);
        return obj;
    }
}
