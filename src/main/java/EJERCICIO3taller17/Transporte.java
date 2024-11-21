/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO3taller17;

/**
 *
 * @author asd
 */
public abstract class Transporte {
    protected String tipo;

    public Transporte(String tipo) {
        this.tipo = tipo;
    }

    public abstract void mover();    
}
