/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO3taller17;

/**
 *
 * @author asd
 */
public class Coche extends Transporte {
    public Coche() {
        super("Coche");
    }

    @Override
    public void mover() {
        System.out.println("El coche se mueve conduciendo.");
    }
}
