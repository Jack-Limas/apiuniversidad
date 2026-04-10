package com.universidad.apiuniversidad.service;

import com.universidad.apiuniversidad.model.Administrativo;
import org.springframework.stereotype.Service;

@Service
public class AdministrativoService {

    // Datos de prueba fijos (en un proyecto real vendrian de base de datos)
    private Administrativo admin = new Administrativo(
        "Carlos Lopez", 
        "carlos@uni.edu", 
        "Registro"
    );

    public String notificar(String mensaje) {
        return "Correo enviado con exito a " + admin.getNombre()
                + " (" + admin.getCorreo() + ")"
                + " - Mensaje: " + mensaje;
    }

    public String aprobar(String codigoSolicitud) {
        return "Solicitud " + codigoSolicitud
                + " aprobada por " + admin.getNombre()
                + " del area de " + admin.getArea();
    }
}