package com.universidad.apiuniversidad.model;

import com.universidad.apiuniversidad.interfaces.Autenticable;
import com.universidad.apiuniversidad.interfaces.Evaluador;

// Hereda de Persona
// Implementa Autenticable y Evaluador
public class Profesor extends Persona implements Autenticable, Evaluador {

    private String especialidad;

    public Profesor(String nombre, String correo, String especialidad) {
        super(nombre, correo);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public boolean login(String usuario, String password) {
        return false;
    }

    @Override
    public String evaluar(String nombreEstudiante, double nota) {
        return nombreEstudiante;
    }
}