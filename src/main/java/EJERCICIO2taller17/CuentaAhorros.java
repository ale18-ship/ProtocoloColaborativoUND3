/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO2taller17;

/**
 *
 * @author asd
 */
public class CuentaAhorros extends CuentaBancaria {
    private final double interesAnual;

    public CuentaAhorros(double saldoInicial, double interesAnual) {
        super(saldoInicial); // Llama al constructor de la clase base con el saldo inicial
        this.interesAnual = interesAnual;
    }

    @Override
    public void depositar(double monto) {
        if (monto >= 50) {
            super.depositar(monto); // Llama al método depositar de la clase base
        } else {
            System.out.println("El depósito mínimo para una cuenta de ahorros es 50.");
        }
    }

    public void aplicarInteres() {
        double interes = saldo * interesAnual;
        depositar(interes);
    }
}