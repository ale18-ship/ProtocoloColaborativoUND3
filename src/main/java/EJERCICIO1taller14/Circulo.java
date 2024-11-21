/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO1taller14;

/**
 *
 * @author asd
 */
public class Circulo extends Figura {
    private final double radio;  

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo es: " + area);
    }
    
}
