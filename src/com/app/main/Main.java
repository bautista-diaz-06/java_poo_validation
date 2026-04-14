package com.app.main;

import com.app.seguridad.Validacion;
import com.app.usuario.Usuario;

public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("bdiaaz", "bautistadiaz", "bautistadiaaz06@gmail.com");

        usuario.getInfo();

        Validacion validacion = new Validacion();

        System.out.println("Contraseñas ingresadas iguales? "
                +
                validacion.validarContrasena(usuario, "bautistadiaz"));

    }
}
