package com.example.Primeiro_projeto_java_todolist.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/primeira_rota")

public class primeira_controller {
    @GetMapping("/primeiro_metodo")
    public String primeiro_metodo(){
        return "funciona";

    }
}
