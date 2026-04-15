package dev.trabajo.trabajadores;

import dev.trabajo.persona.Persona;

public class Empleado extends Persona {
    protected Double remuneracion;
    protected Integer empleadoId;
    private static Integer iteradorId = 0;

    public Empleado(String nombre, String apellido, String dni, String direccion, Double remuneracion) {
        super(nombre, apellido, dni, direccion);
        this.remuneracion = remuneracion;
        this.empleadoId = ++iteradorId;
    }

    public Double getRemuneracion() {
        return remuneracion;
    }

    public Integer getEmpleadoId() {
        return empleadoId;
    }

    public void aumentarRemuneracion(Integer aumento) {
        this.remuneracion += aumento;
    }

    @Override
    public String toString() {
        return "Empleado: " +
                "empleadoId=" + empleadoId +
                ", remuneracion=" + remuneracion +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", direccion='" + direccion + '\'';
    }

    @Override
    public String obtenerTipo() {
        return "Empleado";
    }

    @Override
    public String obtenerRol() {
        return "El empleado trabaja en el area que le corresponde";
    }
}
