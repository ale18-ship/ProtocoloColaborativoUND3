/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO3taller16;

/**
 *
 * @author asd
 */
public class Mensajero {
    private final CanalDeComunicacion canalDeComunicacion;

    public Mensajero(CanalDeComunicacion canalDeComunicacion) {
        this.canalDeComunicacion = canalDeComunicacion;
    }

    public void enviarMensaje(String destinatario, String contenido) {
        canalDeComunicacion.enviar(destinatario, contenido);
    }

}
