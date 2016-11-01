/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elementos;

import java.util.ArrayList;
/**
 *
 * @author Miguel Sanchez
 * @author Lucio Arias
 */
public class Mar {
    private final int dimensionHorizontal = 10;
    private final int dimensionVertical = 10;
    private ArrayList<String> tablero;
    
    
    public Mar()
    {
        
    }
    
    public ArrayList crearMar(){
        ArrayList<ArrayList<String>> mar = new ArrayList<ArrayList<String>>();
                for (int i = 0; i < 10; i++) {
                    mar.add(new ArrayList<String>());
                    for (int j = 0; j < 10; j++) {
                        mar.get(i).add(" ");
                    }
                }
            return mar;  
    }
    
    public void imprimir(){
        for (int i = 0; i < 10; i++) {
            System.out.println(this.crearMar().get(i));
        }
    }
        
    
}
