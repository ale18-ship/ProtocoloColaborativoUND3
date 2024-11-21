/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIO2taller14;

/**
 *
 * @author asd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.presentarse();

        Persona estudiante = new Estudiante();
        estudiante.presentarse();

        Persona profesor = new Profesor();
        profesor.presentarse(); 
    }
    
}
