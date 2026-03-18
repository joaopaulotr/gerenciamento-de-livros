package com._exercicios.demo.controller;

import com._exercicios.demo.models.LivroModel;
import com._exercicios.demo.services.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/livros")

public class LivroController {

    @Autowired
    public LivroService livroService;

    @GetMapping
    public List<LivroModel> findAll(){
        return livroService.listarLivros();
    }

    @PostMapping
    public LivroModel save(@RequestBody LivroModel livroModel){
        return livroService.criarLivro(livroModel);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        livroService.deletarLivro(id);
    }

    @GetMapping
    public LivroModel findById(@RequestParam Long id){
        return livroService.findById(id);
    }
}
