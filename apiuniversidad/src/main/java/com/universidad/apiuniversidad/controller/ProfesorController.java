package com.universidad.apiuniversidad.controller;

import com.universidad.apiuniversidad.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profesor")
public class ProfesorController {

    @Autowired
    ProfesorService service;

    // URL: localhost:8080/profesor/login?usuario=juan@uni.edu&password=Matematicas
    @GetMapping("/login")
    public String login(@RequestParam String usuario, @RequestParam String password) {
        return service.login(usuario, password);
    }

    // URL: localhost:8080/profesor/evaluar?nombre=Ana&nota=4.5
    @GetMapping("/evaluar")
    public String evaluar(@RequestParam String nombre, @RequestParam double nota) {
        return service.evaluar(nombre, nota);
    }
}