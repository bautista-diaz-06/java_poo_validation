package dev.trabajo.persona;

public class Persona {
    protected String nombre;
    protected String apellido;
    protected String dni;
    protected String direccion;

    public Persona(String nombre, String apellido, String dni, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", direccion='" + direccion + '\'';
    }
}
