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
public class Punto
{
    private int coorX;
    private int coorY;

    public Punto(int coorX, int coorY)
    {
        this.coorX = coorX;
        this.coorY = coorY;
    }

    public int getCoorX()
    {
        return coorX;
    }

    public int getCoorY()
    {
        return coorY;
    }

    public void setCoorX(int coorX)
    {
        this.coorX = coorX;
    }

    public void setCoorY(int coorY)
    {
        this.coorY = coorY;
    }
}
