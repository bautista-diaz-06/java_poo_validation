package com.app.usuario;

public class Usuario {
    protected String nombre;
    private String contrasena;
    public String email;

    public Usuario(String nombre, String contrasena, String email) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.email = email;
    }

    public void getInfo() {
        System.out.println(nombre + " " + " " + email);
    }

    public boolean compararContrasena(String contrasena) {
        return this.contrasena.equals(contrasena);
    }
}
