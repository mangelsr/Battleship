/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elementos;

import java.util.Random;

/**
 *
 * @author Miguel Sanchez
 * @author Lucio Arias
 */
public class Jugador
{
    private final Tablero t;
    private final String nombre;
    private final int barcoDisponibles = 5;
    private final Barco[] barcos = new Barco[5];
    
    private final Random rd = new Random();
            
    public Jugador(String nombre)
    {
        this.t = new Tablero();
        this.nombre = nombre;
        this.crearBarcos();
        this.ubicarBarcos();
        
    }
  
    public void crearBarcos(){
        barcos[0] = new Battleship();
        barcos[1] = new Crucero();
        barcos[2] = new Destructor();
        barcos[3] = new Submarino();
        int x = rd.nextInt(4)+1;
        switch(x)
        {
            case 1:
                barcos[4] = new Battleship();
                break;
                
            case 2:
                barcos[4] = new Crucero();
                break;
                
            case 3:
                barcos[4] = new Destructor();
                break;
            case 4:
                barcos[4] = new Submarino();
                break;
        }
    }
    
    public void ubicarBarcos()
    {
        for (int i=0; i <=4; i++)
        {
            t.ubicarBarco(barcos[i]);
        }
    }
    
    /**
     * Funcion que muestra el tablero del jugador con sus barcos incluidos
     * 
     */
    public void mostrarMar()
    {
        System.out.println("Mar de: " + this.nombre);
        this.t.imprimirTablero();
    }
}
