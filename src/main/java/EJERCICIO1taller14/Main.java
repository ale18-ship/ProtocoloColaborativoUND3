/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIO1taller14;

/**
 *
 * @author asd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figura circulo = new Circulo(5);
        circulo.calcularArea();  

        Figura rectangulo = new Rectangulo(4, 6);
        rectangulo.calcularArea();  
    }
    
}
