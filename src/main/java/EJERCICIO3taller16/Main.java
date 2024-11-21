/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIO3taller16;

/**
 *
 * @author asd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CanalDeComunicacion canalCorreo = new CanalCorreo();
        Mensajero mensajeroCorreo = new Mensajero(canalCorreo);
        mensajeroCorreo.enviarMensaje("correo@ejemplo.com", "Este es un correo de prueba.");

        CanalDeComunicacion canalSMS = new CanalSMS();
        Mensajero mensajeroSMS = new Mensajero(canalSMS);
        mensajeroSMS.enviarMensaje("123456789", "Este es un SMS de prueba.");

        CanalDeComunicacion canalPush = new CanalPush();
        Mensajero mensajeroPush = new Mensajero(canalPush);
        mensajeroPush.enviarMensaje("usuario123", "Este es un mensaje de notificación push.");
    }
    
}
