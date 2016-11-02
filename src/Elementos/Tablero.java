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
    private int[][] tablero = new int[10][10];
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
                tablero[i][j] = 0;
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
    }
    
    /**
     * La funcion ubicarBarco es la encargada de ubicar los barcos en la matriz
     * @param b Recive como parametro un Barco
     */
    
    
    public void ubicarBarco(Barco b)
    {
        int x = b.coordenadaInicial.coorX;
        int y = b.coordenadaInicial.coorY;
        int z = b.numeroDeCasillas;
        boolean desubicado = true;
        
        switch(b.orientacion)
        {
            
            case 0:
                
                do
                {
                    algo2: try
                    {
                        int valido = 0;
                        for (int c=1; c<=y ;c++)
                        {
                            if (tablero[x][y+c] == 0)
                                valido += 1;
                        }
                        if (valido == z)
                        {
                            for (int c=1; c<=y ;c++)
                            {
                                tablero[x][y+c] = z;
                            }
                        }
                        desubicado = false;
                    }
                    catch(Exception e)
                    {
                        b.coordenadaInicial.coorX = rd.nextInt(9);
                        b.coordenadaInicial.coorY = rd.nextInt(9);
                        break algo2;
                    }
                }
                while(desubicado);
                
                
            case 1:
                do
                {
                    algo: try
                    {
                        int valido = 0;
                        for (int c=1; c<=x ;c++)
                        {
                            if (tablero[x+c][y] == 0)
                                valido += 1;
                        }
                        if (valido == z)
                        {
                            for (int c=1; c<=x ;c++)
                            {
                                tablero[x+c][y] = z;
                            }
                        }
                        desubicado = false;

                    }
                    catch(Exception e)
                    {
                        b.coordenadaInicial.coorX = rd.nextInt(9);
                        b.coordenadaInicial.coorY = rd.nextInt(9);
                        break algo;
                    }
                }
                while (desubicado);
                
                break;
        }
    }
    
}
