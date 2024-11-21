/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIO2taller15;

/**
 *
 * @author asd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto producto = new Producto("Laptop", 1000.0, 0.15);

        GestorPrecios gestorPrecios = new GestorPrecios();
        double precioFinal = gestorPrecios.calcularPrecioFinal(producto);

        GestorEtiquetas gestorEtiquetas = new GestorEtiquetas();
        String etiqueta = gestorEtiquetas.generarEtiqueta(producto, precioFinal);

        System.out.println(etiqueta);
    }
    
}
