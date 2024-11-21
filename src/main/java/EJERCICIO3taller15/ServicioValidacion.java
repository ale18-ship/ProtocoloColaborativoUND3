/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO3taller15;

/**
 *
 * @author asd
 */
public class ServicioValidacion {
    public boolean validarNombreUsuario(String nombreUsuario) {
        return nombreUsuario != null && !nombreUsuario.isBlank() && nombreUsuario.length() >= 5;
    }

    public boolean validarContrasena(String contrasena) {
        return contrasena != null && contrasena.length() >= 8;
    }    
}
