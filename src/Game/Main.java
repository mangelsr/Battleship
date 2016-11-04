/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import Elementos.Jugador;
import Elementos.Punto;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Miguel Sanchez
 * @author Lucio Arias
 */
public class Main
{
    static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args)
    {
        String op = "";
        
        while (!"4".equals(op))
        {
            imprimirMenu();
            System.out.print("Ingrese la opcion: ");
            op = entrada.next();

            while(!(op.equals("1") || op.equals("2") || op.equals("3") || op.equals("4")))
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
                
                jugar(jugador1, jugador2);
                
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
                System.out.println("Gracias por jugar");
        }
        
    }
    
    public static void jugar(Jugador p1, Jugador p2)
    {
        while (p1.getpuedeJugar() && p2.getpuedeJugar())
        {
            p1.mostrarMar();
            turno(p1,p2);
            if (! p2.getpuedeJugar())
            {
                System.out.println("FIN DEL JUEGO");
                System.out.println("El Ganador es: " + p1.getnombre());
                break;
            }
            
            p2.mostrarMar();
            turno(p2,p1);
            if (! p1.getpuedeJugar())
            {
                System.out.println("FIN DEL JUEGO");
                System.out.println("El Ganador es: " + p2.getnombre());
                break;
            }
        }
        
    }
    
    public static void turno(Jugador p1, Jugador p2)
    {
        String op2= "";
        int x,y;
        
        System.out.println("====== "+ p1.getnombre() +" ======");
        System.out.println("1. Disparar arma normal");
        System.out.println("2. Disparar arma especial");
        
        System.out.print("Que desea hacer: ");
        op2 = entrada.next();
        
        while(!("1".equals(op2) || "2".equals(op2)))
        {
            System.err.println("Por favor ingrese una opcion valida");
            System.out.print("Ingrese la opcion: ");
            op2 = entrada.next();
        }
        
        System.out.print("Ingrese las coordenas a atacar: ");
        String coord = entrada.next();
        
        while (true)
            {
            try
            {
                String coords[] = coord.split(",");
                x = Integer.parseInt(coords[0]);
                y = Integer.parseInt(coords[1]);
                if ((x<=0 || x>10)&&(y<=0 || y>10))
                {
                    System.err.println("Las coordenadas tienen rangos de 1 a 10");
                    System.out.print("Ingrese las coordenas a atacar: ");
                    coord = entrada.next();
                }
                else
                    break;
            }
            catch (Exception e)
            {
                System.err.println("Ingrese bien los datos ejemplo de formato x,y");
                System.out.print("Ingrese las coordenas a atacar: ");
                coord = entrada.next();
            }
        }

        x -= 1;
        y -= 1;
        
        if ("1".equals(op2))
        {
            Punto p = new Punto(x,y);
            p1.disparar(p1.getArmnormal(), p2.getTablero(), p);
        }
        else
        {
            if (x==0)
                x+=1;
            if (x==9)
                x-=1;
            if (y==0)
                y+=1;
            if (y==9)
                y-=1;
            Punto p =new Punto(x,y);
            p1.disparar(p1.getArmespecial(), p2.getTablero(), p);
        }
        p2.actualizarFlota();
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
        catch (IOException e){}
    }
    
}
