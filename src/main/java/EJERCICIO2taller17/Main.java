/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIO2taller17;

/**
 *
 * @author asd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria(1000);
        cuenta1.depositar(500);
        cuenta1.retirar(300);
        System.out.println("Saldo cuenta1: " + cuenta1.getSaldo());

        CuentaAhorros cuenta2 = new CuentaAhorros(2000, 0.05);
        cuenta2.depositar(100);  // Depósito válido
        cuenta2.depositar(30);   // Depósito inválido (menos de 50)
        cuenta2.aplicarInteres(); // Aplica el interés anual
        System.out.println("Saldo cuenta2: " + cuenta2.getSaldo());
    }
    
}
