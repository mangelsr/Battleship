/**
 * Paquete que contiene las distintas clases que componen el juego principal
 * Contiene a: Armas, ArmaEspecial, ArmaNormal, Barco, Battleship, Crucero, Destructor, Submarino, Jugador, Punto, Tablero.
 */
package Elementos;

import java.util.Random;

/**
 * La clase Tablero es una clase que contiene a los barcos de cada jugador
 * dentro de una matriz de tamaño 10x10
 * @author Miguel Sanchez
 * @author Lucio Arias
 */
public class Tablero
{
    /**
     * Varible Protegida: tablero bidimensional de 10x10
     * Variable privada final: rd Numero Random
     */
    protected String[][] tablero = new String[10][10];
    private final Random rd = new Random();
    
    
    /**
     * El constructor de la clase Tablero inicializa la matriz de 10x10
     * que llena con la letra x.
     */
    public Tablero()
    {
        for (int i=0; i<=9; i++)
        {
            for(int j=0; j<=9; j++)
            {
                tablero[i][j] = "x";
            }
        }
    }
    
    /**
     * La funcion imprimirTablero es la encargada de imprimir la matriz
     * que se inicializo con letras x en el constructor, tambien le da el formato
     * de salida para que el usuario distinga las coordenadas
     */
    public void imprimirTablero()
    {
        System.out.printf("\t");
        for (int i=0; i<=9; i++)
        {
            System.out.printf("%d.  ",i+1);
        }
        System.out.println();
        System.out.println();
        for (int i=0; i<=9; i++)
        {
            System.out.printf("%d.\t",i+1);
            for(int j=0; j<=9; j++)
            {
                System.out.printf(tablero[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
    
    /**
     * La funcion ubicarBarco es la encargada de ubicar los barcos en la matriz
     * @param b Recive como parametro un Barco
     */
    public void ubicarBarco(Barco b)
    {
        switch(b.orientacion)
        {
            case 0:       
                while(true)
                {
                    try
                    {
                        int valido = 0;
                        for (int c=-1; c<=b.numeroDeCasillas ;c++)
                        {
                            if (tablero[b.coordenadaInicial.coorX-1]
                                    [b.coordenadaInicial.coorY+c].equals("x") &&
                                    tablero[b.coordenadaInicial.coorX+1]
                                    [b.coordenadaInicial.coorY+c].equals("x") &&
                                    tablero[b.coordenadaInicial.coorX]
                                    [b.coordenadaInicial.coorY+c].equals("x"))
                                valido += 1;
                            else
                                break;
                        }
                        if (valido == b.numeroDeCasillas+2)
                        {
                            for (int c=0; c<b.numeroDeCasillas ;c++)
                            {
                                int x = b.coordenadaInicial.coorX;
                                int y = b.coordenadaInicial.coorY+c;
                                Punto p = new Punto(x,y);
                                b.coordenadas[c] = p;
                                tablero[b.coordenadaInicial.coorX]
                                        [b.coordenadaInicial.coorY+c] = 
                                        "\u001B[32mO\u001B[0m";
                            }
                            break;
                        }
                        b.coordenadaInicial.coorX = rd.nextInt(10);
                        b.coordenadaInicial.coorY = rd.nextInt(10);
                    }
                    catch(Exception e)
                    {
                        b.coordenadaInicial.coorX = rd.nextInt(10);
                        b.coordenadaInicial.coorY = rd.nextInt(10);
                    }
                }
                break;
                
            case 1:
                while (true)
                {
                    try
                    {
                        int valido = 0;
                        for (int c=-1; c<=b.numeroDeCasillas ;c++)
                        {
                            
                            if (tablero[b.coordenadaInicial.coorX+c]
                                    [b.coordenadaInicial.coorY-1].equals("x") &&
                                    tablero[b.coordenadaInicial.coorX+c]
                                    [b.coordenadaInicial.coorY+1].equals("x") &&
                                    tablero[b.coordenadaInicial.coorX+c]
                                    [b.coordenadaInicial.coorY].equals("x") )
                                valido += 1;
                            else
                                break;
                        }
                        if (valido == b.numeroDeCasillas+2)
                        {
                            for (int c=0; c<b.numeroDeCasillas ;c++)
                            {
                                int x = b.coordenadaInicial.coorX+c;
                                int y = b.coordenadaInicial.coorY;
                                Punto p = new Punto(x,y);
                                b.coordenadas[c] = p;
                                tablero[b.coordenadaInicial.coorX+c]
                                        [b.coordenadaInicial.coorY] = 
                                        "\u001B[32mO\u001B[0m";                    
                            }
                            break;
                        }
                        b.coordenadaInicial.coorX = rd.nextInt(10);
                        b.coordenadaInicial.coorY = rd.nextInt(10);
                    }
                    catch(Exception e)
                    {
                        b.coordenadaInicial.coorX = rd.nextInt(10);
                        b.coordenadaInicial.coorY = rd.nextInt(10);
                    }
                }
                break;
        }
    }

}
