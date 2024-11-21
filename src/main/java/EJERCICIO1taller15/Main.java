/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIO1taller15;

/**
 *
 * @author asd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro = new Libro("El Principito", "Antoine de Saint-Exupéry", 96);

        GestorReportes gestorReportes = new GestorReportes();
        gestorReportes.generarReporte(libro);

        GestorPersistencia gestorPersistencia = new GestorPersistencia();
        gestorPersistencia.guardarEnBaseDeDatos(libro);
    }
}
