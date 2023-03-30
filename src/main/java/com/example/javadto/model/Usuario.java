package com.example.javadto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    private Integer cedula;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "email")
    private String email;
    @Column(name = "alias")
    private String alias;
    @Column(name = "contrasena")
    private String contrasena;
    @Column(name = "edad")
    private String edad;
    @Column(name = "habilitada")
    private boolean cuentaHabilitada;
    @Column(name = "apellido")
    private String apellido;

    public Usuario() {
    }

    public Usuario(Integer cedula, String nombre, String email, String alias, String contrasena, String edad, boolean cuentaHabilitada, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.email = email;
        this.alias = alias;
        this.contrasena = contrasena;
        this.edad = edad;
        this.cuentaHabilitada = cuentaHabilitada;
        this.apellido = apellido;
    }

    public Integer getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getAlias() {
        return alias;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getEdad() {
        return edad;
    }

    public boolean isCuentaHabilitada() {
        return cuentaHabilitada;
    }

    public String getApellido() {
        return apellido;
    }
}
