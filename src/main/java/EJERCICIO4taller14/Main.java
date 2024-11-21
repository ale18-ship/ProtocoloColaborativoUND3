/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIO4taller14;

/**
 *
 * @author asd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.mover();

        Vehiculo coche = new Coche();
        coche.mover();

        Vehiculo bicicleta = new Bicicleta();
        bicicleta.mover();
    }
    
}
