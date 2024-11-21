/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO2taller16;

/**
 *
 * @author asd
 */
public class DocumentoExcel implements DocumentoExportable {
    private final String contenido;

    public DocumentoExcel(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public void exportar() {
        System.out.println("Exportando documento a Excel...");
        System.out.println("Contenido: " + contenido);
    }
}
