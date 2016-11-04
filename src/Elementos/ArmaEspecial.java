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
            //Cambiar esto
            for(int i=-1; i<=1; i++)
            {
                for (int j=-1; j<=1; j++)
                {
                    if (! t.tablero[p.coorX+i][p.coorY+j].equals("0"))
                        t.tablero[p.coorX+i][p.coorY+j] = "\u001B[31m-\u001B[0m"; 
                }
            }
            this.numeroMuniciones -= 1;
        }
        else
            System.err.println("Se acabaron las municiones");
  
    }
     
}
