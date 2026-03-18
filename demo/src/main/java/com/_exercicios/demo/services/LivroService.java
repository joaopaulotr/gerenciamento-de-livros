package com._exercicios.demo.services;


import com._exercicios.demo.models.LivroModel;
import com._exercicios.demo.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {
    @Autowired
    public LivroRepository livroRepository;

    public LivroModel criarLivro(LivroModel livroModel){
        return livroRepository.save(livroModel);
    }
    public List<LivroModel> listarLivros(){ return livroRepository.findAll();}

    public void deletarLivro(Long id){
        livroRepository.deleteById(id);
    }

    public LivroModel findById(Long id){
        return livroRepository.findById(id).get();
    }
}
