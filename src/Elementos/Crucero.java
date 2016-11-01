/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elementos;

/**
 *
 * @author Usuario
 */
public class Crucero extends Barco
{
    
    public Crucero(Punto coordenadaInicial,Mar tablero)
    {
        this.coordenadaInicial = coordenadaInicial;
        this.tablero = tablero;
        this.numeroDeCasillas = 3; //verificar
    }

    @Override
    public void ubicar(Mar tablero) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
