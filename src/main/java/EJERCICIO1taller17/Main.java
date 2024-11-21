/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIO1taller17;

/**
 *
 * @author asd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figura figura1 = new Circulo(5);
        Figura figura2 = new Rectangulo(4, 6);

        System.out.println("Área del círculo: " + figura1.calcularArea());
        System.out.println("Área del rectángulo: " + figura2.calcularArea());
    }
    
}
