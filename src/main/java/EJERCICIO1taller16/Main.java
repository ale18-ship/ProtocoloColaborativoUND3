/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIO1taller16;

/**
 *
 * @author asd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Descuento descuentoPorcentaje = new Descuento(10);
        double precioOriginal = 100.0;
        double precioConDescuentoPorcentaje = descuentoPorcentaje.aplicarDescuento(precioOriginal);
        System.out.println("Precio original: $" + precioOriginal);
        System.out.println("Precio con 10% de descuento: $" + precioConDescuentoPorcentaje);

        DescuentoFijo descuentoFijo = new DescuentoFijo(15.0);
        double precioConDescuentoFijo = descuentoFijo.aplicarDescuento(precioOriginal);
        System.out.println("Precio con $15 de descuento: $" + precioConDescuentoFijo);
    }
    
}
