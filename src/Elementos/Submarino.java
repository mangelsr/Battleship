/**
 * Paquete que contiene las distintas clases que componen el juego principal
 * Contiene a: Armas, ArmaEspecial, ArmaNormal, Barco, Battleship, Crucero, Destructor, Submarino, Jugador, Punto, Tablero.
 */
package Elementos;

/**
 * Clase hija mas pequeña de barco 
 * @author Miguel Sanchez
 * @author Lucio Arias
 */
public class Submarino extends Barco
{
    /**
     * Constructor de Submarino por defecto con los valores iniciales de su padre Barco 
     * mas un numero de casillas y las coordenadas iniciales que tendra en el tablero.
     */
    public Submarino()
    {
        this.numeroDeCasillas = 1;
        this.coordenadas = new Punto[this.numeroDeCasillas];
    }
    
}
