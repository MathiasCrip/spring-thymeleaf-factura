package org.bedu.javabackendproyecto.proyectospringthymeleaft.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cliente {

    //Inyecta el nombre por medio del archivo application.properties
    @Value("${cliente.nombre}")
    private String nombre;

    //Inyecta el apellido por medio del archivo application.properties
    @Value("${cliente.apellido}")
    private String apellido;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
