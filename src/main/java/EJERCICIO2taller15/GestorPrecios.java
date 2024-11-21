/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO2taller15;

/**
 *
 * @author asd
 */
public class GestorPrecios {
    public double calcularPrecioFinal(Producto producto) {
        return producto.getPrecioBase() + (producto.getPrecioBase() * producto.getImpuesto());
    }    
}
