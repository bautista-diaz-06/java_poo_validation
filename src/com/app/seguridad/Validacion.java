package com.app.seguridad;

import com.app.usuario.Usuario;

public class Validacion  {

    public boolean validarContrasena(Usuario u, String contrasena) {
        return u.compararContrasena(contrasena);
    }

}
