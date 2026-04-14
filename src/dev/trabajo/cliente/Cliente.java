package dev.trabajo.cliente;

import dev.trabajo.persona.Persona;

public class Cliente extends Persona {
    private Integer id;
    private static Integer iteradorId = 0;

    public Cliente(String nombre, String apellido, String dni, String direccion) {
        super(nombre, apellido, dni, direccion);
        this.id = ++iteradorId;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Cliente: " +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", direccion='" + direccion + '\'';
    }
}
