/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO3taller16;

/**
 *
 * @author asd
 */
public class CanalCorreo implements CanalDeComunicacion {
    @Override
    public void enviar(String destinatario, String contenido) {
        System.out.println("Enviando correo a " + destinatario);
        System.out.println("Contenido del correo: " + contenido);
    }
}
