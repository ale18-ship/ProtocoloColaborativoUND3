/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO2taller16;

/**
 *
 * @author asd
 */
public class DocumentoWord implements DocumentoExportable {
    private final String contenido;

    public DocumentoWord(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public void exportar() {
        System.out.println("Exportando documento a Word...");
        System.out.println("Contenido: " + contenido);
    }
}
