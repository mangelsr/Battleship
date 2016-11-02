package Elementos;

import java.util.Random;

/**
 * La clase Barco es la clase padre para los subtipos de barcos que 
 * se colocan en el tablero, los atributos principales de los barcos son:
 * su orientacion, valor entero, 1 para vertical, 0 para horizontal
 * su numero de casillas, esto va a depender del tipo de barco
 * su coordenada inicial, es el punto en el tablero donde se comienza para colocar el barco
 * @author Miguel Sanchez
 * @author Lucio Arias
 */
public class Barco
{
    protected Punto coordenadaInicial;
    protected int numeroDeCasillas;
    protected int orientacion;
    
    private final Random rd = new Random();
    
    /**
     * Constructor por defecto que inicializa cada Barco con un punto cuyas
     * coordenadas son aleatorias entre 0 y 9 
     * y un valor aleatorio para la orientacion
     */
    public Barco()
    {
        this.coordenadaInicial = new Punto(rd.nextInt(9), rd.nextInt(9));
        this.orientacion = rd.nextInt(2); //Esta fallando este random!!
    }

    
    public Punto getCoordenadaInicial() {
        return coordenadaInicial;
    }

    public int getNumeroDeCasillas() {
        return numeroDeCasillas;
    }

    public int getOrientacion() {
        return orientacion;
    }

    public void setCoordenadaInicial(Punto coordenadaInicial) {
        this.coordenadaInicial = coordenadaInicial;
    }

    public void setNumeroDeCasillas(int numeroDeCasillas) {
        this.numeroDeCasillas = numeroDeCasillas;
    }

    public void setOrientacion(int orientacion) {
        this.orientacion = orientacion;
    }
    
}
