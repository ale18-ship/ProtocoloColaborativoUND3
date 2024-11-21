/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIO2taller16;

/**
 *
 * @author asd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DocumentoExportable documentoPDF = new DocumentoPDF("Este es un documento en formato PDF.");
        DocumentoExportable documentoWord = new DocumentoWord("Este es un documento en formato Word.");
        DocumentoExportable documentoExcel = new DocumentoExcel("Este es un documento en formato Excel.");

        documentoPDF.exportar();
        documentoWord.exportar();
        documentoExcel.exportar();
    }
    
}
