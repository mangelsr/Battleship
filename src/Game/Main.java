/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;
import Elementos.Jugador;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Main {
    static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String op = "";
        
        while (!"4".equals(op))
        {
            imprimirMenu();
            System.out.print("Ingrese la opcion: ");
            op = entrada.next();

            while(!("1".equals(op) || "2".equals(op) || "3".equals(op) || "4".equals(op)))
            {
                System.err.println("Por favor ingrese una opcion valida");
                System.out.print("Ingrese la opcion: ");
                op = entrada.next();
            }
            
            if ("1".equals(op))
            {
                System.out.println("Ingrese el nombre del Jugador 1: ");
                String nJugador1 = entrada.next();
                Jugador jugador1 = new Jugador(nJugador1);
                
                System.out.println("Ingrese el nombre del Jugador 2: ");
                String nJugador2 = entrada.next();
                Jugador jugador2 = new Jugador(nJugador2);
                
                jugador1.mostrarMar();
                
                jugador2.mostrarMar();
                //mucho codigo...
            }
            
            else if ("2".equals(op))
            {
                imprimirInstrucciones();
            }
            
            else if ("3".equals(op))
            {
                imprimirAcercaDe();
            }
            
            else
                System.out.println("GG IZI");
        }
        
    }
    
    public static void imprimirMenu()
    {
        System.out.println("BATTLESHIP");
        System.out.println("1. Nuevo Juego");
        System.out.println("2. Instrucciones");
        System.out.println("3. Acerca de");
        System.out.println("4. Salir");
    }
    
    public static void imprimirAcercaDe()
    {
        System.out.println("Acerca de...");
        pausa();
    }
    
    public static void imprimirInstrucciones()
    {
        System.out.println("Instrucciones...");
        pausa();
    }
    
    static void pausa()
    {
        System.out.println("Presione enter para regresar al menu...");
        try 
        {System.in.read();} 
        catch (IOException e)
        {e.printStackTrace();}
    }
    
}
