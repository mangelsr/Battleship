/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elementos;

/**
 *
 * @author Administrador
 */
public class ArmInfinita extends Armas{

    public ArmInfinita() {
        this.rangoDisparo = 1;
        this.numeroMuniciones = 9999;
    }

    @Override
    public void disparar(Mar tablero,Punto p) {
                
    }
    
    
    
}
