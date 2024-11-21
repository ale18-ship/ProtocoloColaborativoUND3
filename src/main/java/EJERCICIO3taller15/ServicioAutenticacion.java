/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO3taller15;

/**
 *
 * @author asd
 */
public class ServicioAutenticacion {
    public boolean autenticar(Usuario usuario, String nombreUsuario, String contrasena) {
        return usuario.getNombreUsuario().equals(nombreUsuario) && usuario.getContrasena().equals(contrasena);
    }    
}
