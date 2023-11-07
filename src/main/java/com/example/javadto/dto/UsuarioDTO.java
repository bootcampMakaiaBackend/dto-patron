package com.example.javadto.dto;

public class UsuarioDTO {
    private String nombre;
    private String apellido;
    private String alias;
    private String correo;
    private Integer cedula;

    private String contrasena;

    public UsuarioDTO(String nombre, String apellido, String alias, String correo, Integer cedula, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.alias = alias;
        this.correo = correo;
        this.cedula = cedula;
        this.contrasena = contrasena;
    }

    public UsuarioDTO(String nombre, String apellido, String alias, String correo, Integer cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.alias = alias;
        this.correo = correo;
        this.cedula = cedula;
    }

    public UsuarioDTO() {
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

    public Integer getCedula() {
        return cedula;
    }

    public String getContrasena() {
        return contrasena;
    }
}
