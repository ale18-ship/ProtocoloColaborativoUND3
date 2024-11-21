/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO2taller16;

/**
 *
 * @author asd
 */
public class Documento {
    private final String contenido;

    public Documento(String contenido) {
        this.contenido = contenido;
    }

    public void exportar() {
        // Solo exporta a PDF por ahora
        System.out.println("Exportando documento a PDF...");
        System.out.println("Contenido: " + contenido);
    }    
}
