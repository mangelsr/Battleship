/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elementos;

/**
 *
 * @author Administrador
 */
public abstract class Armas {
    protected int numeroMuniciones;
    protected int rangoDisparo;
    
    
    public abstract void disparar(Mar tablero, Punto p);
    
    
    
}
