package com.universidad.apiuniversidad.service;

import com.universidad.apiuniversidad.model.Profesor;
import org.springframework.stereotype.Service;

@Service
public class ProfesorService {

    private Profesor profesor = new Profesor(
        "Dr. Juan Perez", 
        "juan@uni.edu", 
        "Matematicas"
    );

    public String login(String usuario, String password) {
        // Logica de validacion: usuario = correo, password = especialidad
        boolean acceso = usuario.equals(profesor.getCorreo())
                && password.equals(profesor.getEspecialidad());

        if (acceso) {
            return "Acceso correcto. Bienvenido profesor " + profesor.getNombre();
        } else {
            return "Acceso incorrecto, error al entrar.";
        }
    }

    public String evaluar(String nombreEstudiante, double nota) {
        if (nota >= 3.0) {
            return "Estudiante " + nombreEstudiante
                    + " evaluado por el profesor " + profesor.getNombre()
                    + " - Nota: " + nota
                    + " - APROBADO";
        } else {
            return "Estudiante " + nombreEstudiante
                    + " evaluado por el profesor " + profesor.getNombre()
                    + " - Nota: " + nota
                    + " - REPROBADO";
        }
    }
}