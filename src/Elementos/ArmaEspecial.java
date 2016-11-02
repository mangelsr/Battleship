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
public class ArmaEspecial extends Arma
{
    private int numeroMuniciones;
    
    public ArmaEspecial()
    {
        this.numeroMuniciones = 2;
    }
    
    public void disparar(Tablero t, Punto p)
    {
        if (this.numeroMuniciones > 0)
        {
            
            this.numeroMuniciones -= 1;
        }
        else
            System.err.println("Se acabaron las municiones");
  
    }
     
}
