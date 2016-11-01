/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elementos;

/**
 *
 * @author Miguel Sanchez
 * @author Lucio Arias
 */
public abstract class Barco
{
    protected Punto coordenadaInicial;
    protected int numeroDeCasillas;
    protected Mar tablero;

    public abstract void ubicar(Mar tablero);
    
}
