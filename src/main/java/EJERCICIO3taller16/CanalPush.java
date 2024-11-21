/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO3taller16;

/**
 *
 * @author asd
 */
public class CanalPush implements CanalDeComunicacion {
    @Override
    public void enviar(String destinatario, String contenido) {
        System.out.println("Enviando notificación push a " + destinatario);
        System.out.println("Contenido de la notificación: " + contenido);
    }
}
