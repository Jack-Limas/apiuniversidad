package com.universidad.apiuniversidad.controller;

import com.universidad.apiuniversidad.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estudiante")
public class EstudianteController {

    @Autowired
    EstudianteService service;

    // URL: localhost:8080/estudiante/notificar?mensaje=Tienes examen
    @GetMapping("/notificar")
    public String notificar(@RequestParam String mensaje) {
        return service.notificar(mensaje);
    }

    // URL: localhost:8080/estudiante/login?usuario=ana@uni.edu&password=EST-2024
    @GetMapping("/login")
    public String login(@RequestParam String usuario, @RequestParam String password) {
        return service.login(usuario, password);
    }
}