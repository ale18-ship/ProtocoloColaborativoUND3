/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIO3taller15;

/**
 *
 * @author asd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario usuario = new Usuario("admin", "password123");

        ServicioAutenticacion servicioAutenticacion = new ServicioAutenticacion();
        ServicioValidacion servicioValidacion = new ServicioValidacion();

        boolean esNombreValido = servicioValidacion.validarNombreUsuario(usuario.getNombreUsuario());
        boolean esContrasenaValida = servicioValidacion.validarContrasena(usuario.getContrasena());

        if (esNombreValido && esContrasenaValida) {
            System.out.println("Datos válidos del usuario.");

            boolean autenticado = servicioAutenticacion.autenticar(usuario, "admin", "password123");
            if (autenticado) {
                System.out.println("Autenticación exitosa.");
            } else {
                System.out.println("Error en la autenticación.");
            }
        } else {
            System.out.println("Datos inválidos del usuario.");
        }
    }
    
}
