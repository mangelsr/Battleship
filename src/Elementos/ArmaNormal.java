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
public class ArmaNormal extends Arma
{
    public ArmaNormal()
    {
        
    }
    
    public void disparar(Tablero t, Punto p)
    {
        if (t.tablero[p.coorX][p.coorY].equals("0"))
        {
            System.out.println("Disparo fallido");
        }
        else
        {
            t.tablero[p.coorX][p.coorY] = "\u001B[31m-\u001B[0m";
        }
    }
    
}
