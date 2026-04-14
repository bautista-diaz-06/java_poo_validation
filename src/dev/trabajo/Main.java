package dev.trabajo;

import dev.trabajo.cliente.Cliente;
import dev.trabajo.trabajadores.Empleado;
import dev.trabajo.trabajadores.Gerente;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Pepito", "Dupuy", "123456789", "Calle piso");
        System.out.println("ID Cliente: " + cliente.getId());
        System.out.println(cliente.toString());

        Empleado empleado = new Empleado("Bautista", "Díaz", "45896321", "Calle 1456", 3500.0);
        System.out.println("ID Empleado: " + empleado.getEmpleadoId());
        System.out.println(empleado.toString());
        System.out.println("Remuneracion: " + empleado.getRemuneracion());
        empleado.aumentarRemuneracion(3500);
        System.out.println("Nueva remuneracion: " + empleado.getRemuneracion());

        Gerente gerente = new Gerente("Alberto", "Dupuy", "789456123", "Calle 404", 2500.0, 15000.0);
        System.out.println(gerente.toString());
        System.out.println("Presupuesto: " + gerente.getPresupuesto());
        gerente.aumentarRemuneracion(2500);
        gerente.setPresupuesto(5000.0);
        System.out.println("Nueva remuneracion: " + gerente.getRemuneracion());
        System.out.println("Nuevo presupuesto: " + gerente.getPresupuesto());
    }
}
