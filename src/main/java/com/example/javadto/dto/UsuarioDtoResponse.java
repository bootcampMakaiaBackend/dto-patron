package com.example.javadto.dto;


public class UsuarioDtoResponse {

    private String nombre;
    private String apellido;
    private String alias;
    private String correo;
    private Boolean cuentaHabilitada;

    public UsuarioDtoResponse(String nombre, String apellido, String alias, String correo, Boolean cuentaHabilitada) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.alias = alias;
        this.correo = correo;
        this.cuentaHabilitada = cuentaHabilitada;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getAlias() {
        return alias;
    }

    public String getCorreo() {
        return correo;
    }

    public Boolean getCuentaHabilitada() {
        return cuentaHabilitada;
    }
}
