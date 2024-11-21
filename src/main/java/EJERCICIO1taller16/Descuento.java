/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO1taller16;

/**
 *
 * @author asd
 */
public class Descuento {
    private double porcentaje;

    public Descuento(double porcentaje) {
        if (porcentaje < 0 || porcentaje > 100) {
            throw new IllegalArgumentException("El porcentaje debe estar entre 0 y 100.");
        }
        this.porcentaje = porcentaje;
    }

    public double aplicarDescuento(double precioOriginal) {
        return precioOriginal - (precioOriginal * (porcentaje / 100));
    }    
}
