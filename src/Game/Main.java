/**
 * Paquete que contiene al documento main del programa.
 */
package Game;

import Elementos.Jugador;
import Elementos.Punto;
import java.io.IOException;
import java.util.Scanner;

/**
 *Clase principal donde se desarrollara todo el juego.
 * @author Miguel Sanchez
 * @author Lucio Arias
 */
public class Main
{
    static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     * Metodo principal donde se desarrollara el juego.
     */
      
    public static void main(String[] args)
    {
        String op = "";
        
        while (!"3".equals(op))
        {
            imprimirMenu();
            System.out.print("Ingrese la opcion: ");
            op = entrada.next();

            while(!(op.equals("1") || op.equals("2") || op.equals("3")))
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
                System.out.println();
                System.out.println("\u001B[1;34mQue inicie el juego!!\u001B[0m");
                System.out.println();
                jugar(jugador1, jugador2);
                
            }
            else if ("2".equals(op))
            {
                imprimirAcercaDe();
            }          
            else
                System.out.println("Gracias por jugar");
        }
    }
    
    /**
    * Metodo que generara un ciclo de repetición y dara fin al juego mostrando el ganador
    * @param p1: Recibe una instacia de la clase Jugador para el juego
    * @param p2: Recibe una instacia de la clase Jugador para el juego
    */
    public static void jugar(Jugador p1, Jugador p2)
    {
        while (p1.getpuedeJugar() && p2.getpuedeJugar())
        {   
            p1.mostrarMar();
            
            turno(p1,p2);
            if (! p2.getpuedeJugar())
            {
                System.out.println("\u001B[1;34mFin del Juego\u001B[0m");
                System.out.println("\u001B[1;31mEl Ganador es: " + p1.getnombre() 
                        + "\u001B[0m");
                break;
            }
            
            p2.mostrarMar();
            turno(p2,p1);
            if (! p1.getpuedeJugar())
            {
                System.out.println("\u001B[1;34mFin del Juego\u001B[0m");
                System.out.println("\u001B[1;31mEl Ganador es: " + p2.getnombre() 
                        + "\u001B[0m");
                break;
            }
        }
        
    }
    
    /**
    * Metodo que alterna los turnos entre los jugadores, muestra por pantalla el estado de su flota y genera los ataques
    * @param p1: Recibe una instacia de la clase Jugador para el alternar el orden en que juegan
    * @param p2: Recibe una instacia de la clase Jugador para el alternar el orden en que juegan
    */
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
        System.out.println();
        x -= 1;
        y -= 1;
        
        if ("1".equals(op2))
        {
            Punto p = new Punto(x,y);
            p1.getArmaNormal().disparar(p2.getTablero(),p);
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
            p1.getArmespecial().disparar(p2.getTablero(),p);
        }
        p2.actualizarFlota();
    }
    
    /**
    * Imprime el menu principal del juego.
    */
    public static void imprimirMenu()
    {
        System.out.println("\u001B[1;34mBATTLESHIP!\u001B[0m");
        System.out.println("1. Nuevo Juego");
        System.out.println("2. Acerca de");
        System.out.println("3. Salir");
    }
    
    /**
    * Imprime la informacion del programa y sus creador.
    */
    public static void imprimirAcercaDe()
    {
        System.out.println("El juego Battleship consiste en dos jugadores,"
                + "cada uno será el general de una flota de barcos colocados\n"
                + "en un mar y dispondrá de dos armas para disparar.\n"
                + "En su respectivo turno cada general intenta destruir"
                + "los barcos ubicados en el mar de su contrincante disparando\n"
                + "el arma escogida. El juego termina cuando uno de los"
                + "dos generales se queda sin barcos.\nElaborado por:\n"
                + "-Miguel Sanchez\n-Lucio Arias");
        pausa();
    }
    
    /**
    * Genera una pausa antes de regresar al menu principal.
    */
    static void pausa()
    {
        System.out.println("Presione enter para regresar al menu...");
        try 
        {System.in.read();} 
        catch (IOException e){}
    }
    
}
