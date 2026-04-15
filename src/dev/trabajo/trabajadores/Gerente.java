package dev.trabajo.trabajadores;

public class Gerente extends Empleado{
    protected Double presupuesto;

    public Gerente(String nombre, String apellido, String dni, String direccion, Double remuneracion, Double presupuesto) {
        super(nombre, apellido, dni, direccion, remuneracion);
        this.presupuesto = presupuesto;
    }

    public Double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Double presupuesto) {
        this.presupuesto += presupuesto;
    }

    @Override
    public String toString() {
        return "Gerente: " +
                "presupuesto=" + presupuesto +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", direccion='" + direccion + '\'' +
                ", remuneracion=" + remuneracion +
                ", empleadoId=" + empleadoId;
    }

    @Override
    public String obtenerTipo() {
        return "Gerente";
    }

    @Override
    public String obtenerRol() {
        return "El gerente supervisa el trabajo y que se cumplan las consignas";
    }
}
