/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO1taller16;

/**
 *
 * @author asd
 */
public class DescuentoFijo extends Descuento {
    private double montoFijo;

    public DescuentoFijo(double montoFijo) {
        super(0);
        if (montoFijo < 0) {
            throw new IllegalArgumentException("El monto del descuento no puede ser negativo.");
        }
        this.montoFijo = montoFijo;
    }

    @Override
    public double aplicarDescuento(double precioOriginal) {
        double precioConDescuento = precioOriginal - montoFijo;
        return Math.max(precioConDescuento, 0);
    }
}
