package com._exercicios.demo.controller;

import com._exercicios.demo.services.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/livros")

public class LivroController {

    @Autowired
    public LivroService livroService;
}
