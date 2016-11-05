package Elementos;

import java.util.Random;

/**
 * La clase Barco es la clase padre para los subtipos de barcos que 
 * se colocan en el tablero, los atributos principales de los barcos son:
 * su orientacion, valor entero, 1 para vertical, 0 para horizontal
 * su numero de casillas, esto va a depender del tipo de barco
 * su coordenada inicial, es el punto en el tablero donde se comienza para colocar el barco
 * y las coordenadas donde se unica el barco.
 * @author Miguel Sanchez
 * @author Lucio Arias
 */
public class Barco
{
    /**
    * Variable protegida: Punto con las coordenadas iniciales.
    * Variable protegida: Coordenadas
    * Variable protegida: Numero de casillas.
    * Variable protegida: Orientacion.
    * Variable protegida: Destruido
    *
    */
    protected Punto coordenadaInicial;
    protected Punto[] coordenadas;
    protected int numeroDeCasillas;
    protected int orientacion;
    protected boolean destruido;
    /**
    *Variable Privada final: Numero Random
    */
    private final Random rd = new Random();
    
    /**
     * Constructor por defecto que inicializa cada Barco con un punto cuyas
     * coordenadas son aleatorias entre 0 y 9 
     * y un valor aleatorio para la orientacion
     */
    public Barco()
    {
        this.coordenadaInicial = new Punto(rd.nextInt(10), rd.nextInt(10));
        this.orientacion = rd.nextInt(2);
    }
    
    /**
     * Metedo que sirve para verificar si uno de los barcos que hemos atacado esta destruido 
     * @param t: Tablero con los barcos. 
     */
    
    public void verificarCasillasAtacadas(Tablero t)
    {
        int casillasAtacadas = 0;
        for (int i=0; i<numeroDeCasillas; i++)
        {
            if(t.tablero[coordenadas[i].coorX]
                    [coordenadas[i].coorY].equals("\u001B[31m-\u001B[0m"))
                casillasAtacadas += 1;
            
        }
        if (casillasAtacadas == numeroDeCasillas)
            this.destruido = true;
    }
    
    /**
     * @return the coordenadaInicial
     */

    public Punto getCoordenadaInicial() {
        return coordenadaInicial;
    }
        /**
     * @return the numeroDeCasillas
     */

    public int getNumeroDeCasillas() {
        return numeroDeCasillas;
    }
     /**
     * @return the orientacion
     */

    public int getOrientacion() {
        return orientacion;
    }
    /**
     * @param coordenadaInicial the coordenadaInicial to set
     */
    public void setCoordenadaInicial(Punto coordenadaInicial) {
        this.coordenadaInicial = coordenadaInicial;
    }
    /**
     * @param numeroDeCasillas the numeroDeCasillas to set
     */
    public void setNumeroDeCasillas(int numeroDeCasillas) {
        this.numeroDeCasillas = numeroDeCasillas;
    }
    /**
     * @param orientacion the orientacion to set
     */
    public void setOrientacion(int orientacion) {
        this.orientacion = orientacion;
    }
    
}
