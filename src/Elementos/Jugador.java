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
    private final Mar mar;
    private final String nombre;
    private final int barcoDisponibles = 5;
    private final Barco[] barcos = new Barco[5];
    private Punto p;
    
    private final Random rd = new Random();
            
    public Jugador(String nombre)
    {
        this.mar = new Mar();
        this.nombre = nombre;
        this.ubicarBarcos();
        
    }
  
    public void ubicarBarcos(){
        p = new Punto(rd.nextInt(9), rd.nextInt(9));
        barcos[0] = new Battleship(p, mar);
        
        p = new Punto(rd.nextInt(9), rd.nextInt(9));
        barcos[0] = new Crucero(p, mar);
        
        p = new Punto(rd.nextInt(9), rd.nextInt(9));
        barcos[0] = new destructores(p, mar);
        
        p = new Punto(rd.nextInt(9), rd.nextInt(9));
        barcos[0] = new submarinos(p, mar);
        
        //Falta el barco aleatoriio
        
    }
    
    /**
     * Funcion que muestra el tablero del jugador con sus barcos incluidos
     * 
     */
    public void mostrarMar()
    {
        System.out.println("Mar de: " + this.nombre);
        this.mar.imprimir();
    }
}
