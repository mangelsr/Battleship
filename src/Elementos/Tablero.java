/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elementos;

import java.util.Random;

/**
 * La clase Tablero es una clase que contiene a los barcos de cada jugador
 * dentro de una matriz numerica de tamaño 10x10.
 * @author Miguel
 */
public class Tablero
{
    private String[][] tablero = new String[10][10];
    private final Random rd = new Random();
    
    
    /**
     * El constructor de la clase Tablero inicializa la matriz numerica de 10x10
     * que la llena de ceros.
     */
    public Tablero()
    {
        for (int i=0; i<=9; i++)
        {
            for(int j=0; j<=9; j++)
            {
                tablero[i][j] = "0";
            }
        }
    }
    
    /**
     * La funcion imprimirTablero es la encargada de imprimir la matriz numerica
     * que se inicializo con ceros en el constructor, tambien le da el formato
     * de salida para que el usuario distinga las coordenadas.
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
                        for (int c=1; c<=b.numeroDeCasillas ;c++)
                        {
                            if (tablero[b.coordenadaInicial.coorX-1]
                                    [b.coordenadaInicial.coorY+c].equals("0"))
                                valido += 1;
                            if (tablero[b.coordenadaInicial.coorX+1]
                                    [b.coordenadaInicial.coorY+c].equals("0"))
                                valido += 1;
                            if (tablero[b.coordenadaInicial.coorX]
                                    [b.coordenadaInicial.coorY+c].equals("0"))
                                valido += 1;
                            else
                            {
                                b.coordenadaInicial.coorX = rd.nextInt(10);
                                b.coordenadaInicial.coorY = rd.nextInt(10);
                            }
                        }                                       
                        if (valido == 3*b.numeroDeCasillas)
                        {
                            for (int c=1; c<=b.numeroDeCasillas ;c++)
                            {
                                tablero[b.coordenadaInicial.coorX]
                                        [b.coordenadaInicial.coorY+c] = 
                                        "\u001B[32m"+String.valueOf(b.numeroDeCasillas)+"\u001B[0m";
                            }
                            break;
                        }                        
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
                        for (int c=1; c<=b.numeroDeCasillas ;c++)
                        {
                            if (tablero[b.coordenadaInicial.coorX+c]
                                    [b.coordenadaInicial.coorY-1].equals("0"))
                                valido += 1;
                            if (tablero[b.coordenadaInicial.coorX+c]
                                    [b.coordenadaInicial.coorY+1].equals("0"))
                                valido += 1;
                            if (tablero[b.coordenadaInicial.coorX+c]
                                    [b.coordenadaInicial.coorY].equals("0"))
                                valido += 1;
                            else
                            {
                                b.coordenadaInicial.coorX = rd.nextInt(10);
                                b.coordenadaInicial.coorY = rd.nextInt(10);
                            }
                        }
                        if (valido == 3*b.numeroDeCasillas)
                        {
                            for (int c=1; c<=b.numeroDeCasillas ;c++)
                            {
                                tablero[b.coordenadaInicial.coorX+c]
                                        [b.coordenadaInicial.coorY] = 
                                        "\u001B[32m"+String.valueOf(b.numeroDeCasillas)+"\u001B[0m";                    
                            }
                             break;
                        }
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
