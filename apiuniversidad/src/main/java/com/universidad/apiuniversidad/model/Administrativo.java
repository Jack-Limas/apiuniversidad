package com.universidad.apiuniversidad.model;

import com.universidad.apiuniversidad.interfaces.Aprobador;
import com.universidad.apiuniversidad.interfaces.Notificable;

// Hereda de Persona (linea continua en diagrama)
// Implementa Aprobador y Notificable (linea punteada en diagrama)
public class Administrativo extends Persona implements Aprobador, Notificable {

    private String area;

    public Administrativo(String nombre, String correo, String area) {
        super(nombre, correo);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    // La interface nos OBLIGA a tener este metodo
    // pero la logica real esta en el Service
    @Override
    public String aprobarSolicitud(String codigoSolicitud) {
        return codigoSolicitud;
    }

    // La interface nos OBLIGA a tener este metodo
    @Override
    public String enviarNotificacion(String mensaje) {
        return mensaje;
    }
}