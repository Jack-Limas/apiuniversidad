package com.universidad.apiuniversidad.model;

import com.universidad.apiuniversidad.interfaces.Autenticable;
import com.universidad.apiuniversidad.interfaces.Notificable;

// Hereda de Persona
// Implementa Notificable y Autenticable
public class Estudiante extends Persona implements Notificable, Autenticable {

    private String codigo;

    public Estudiante(String nombre, String correo, String codigo) {
        super(nombre, correo);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String enviarNotificacion(String mensaje) {
        return mensaje;
    }

    @Override
    public boolean login(String usuario, String password) {
        return false;
    }
}