package com.universidad.apiuniversidad.service;

import com.universidad.apiuniversidad.model.Estudiante;
import org.springframework.stereotype.Service;

@Service
public class EstudianteService {

    private Estudiante estudiante = new Estudiante(
        "Ana Martinez", 
        "ana@uni.edu", 
        "EST-2024"
    );

    public String notificar(String mensaje) {
        return "Correo enviado con exito a " + estudiante.getNombre()
                + " (" + estudiante.getCorreo() + ")"
                + " - Mensaje: " + mensaje;
    }

    public String login(String usuario, String password) {
        // Logica de validacion: usuario = correo, password = codigo del estudiante
        boolean acceso = usuario.equals(estudiante.getCorreo())
                && password.equals(estudiante.getCodigo());

        if (acceso) {
            return "Acceso correcto. Bienvenido/a " + estudiante.getNombre();
        } else {
            return "Acceso incorrecto, error al entrar.";
        }
    }
}