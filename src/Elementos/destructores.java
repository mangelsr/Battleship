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
public class destructores extends Barco
{
    
    public destructores(Punto coordenadaInicial,Mar tablero)
    {
        this.coordenadaInicial = coordenadaInicial;
        this.tablero = tablero;
        this.numeroDeCasillas = 2; //verificar
    }

    @Override
    public void ubicar(Mar tablero)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
