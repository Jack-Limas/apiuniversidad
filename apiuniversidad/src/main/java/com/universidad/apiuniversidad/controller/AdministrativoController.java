package com.universidad.apiuniversidad.controller;

import com.universidad.apiuniversidad.service.AdministrativoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/administrativo")
public class AdministrativoController {

    @Autowired
    AdministrativoService service;

    // URL: localhost:8080/administrativo/notificar?mensaje=Hola
    @GetMapping("/notificar")
    public String notificar(@RequestParam String mensaje) {
        return service.notificar(mensaje);
    }

    // URL: localhost:8080/administrativo/aprobar?codigo=SOL-001
    @GetMapping("/aprobar")
    public String aprobar(@RequestParam String codigo) {
        return service.aprobar(codigo);
    }
}