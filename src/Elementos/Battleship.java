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
public class Battleship extends Barco
{
    
    public Battleship()
    {
        this.numeroDeCasillas = 4;
        this.coordenadas = new Punto[this.numeroDeCasillas];
    }
   
}
