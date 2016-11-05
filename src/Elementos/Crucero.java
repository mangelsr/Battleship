/**
 * Paquete que contiene las distintas clases que componen el juego principal
 * Contiene a: Armas, ArmaEspecial, ArmaNormal, Barco, Battleship, Crucero, Destructor, Submarino, Jugador, Punto, Tablero.
 */
package Elementos;

/**
 * Clase hija de Barco la cual tendra 3 casillas como tamaño en el tablero.
 * @author Miguel Sanchez
 * @author Lucio Arias
 */
public class Crucero extends Barco
{
    /**
     * Constructor de Submarino por defecto con los valores iniciales de su padre Barco 
     * mas un numero de casillas y las coordenadas iniciales que tendra en el tablero.
     */
    
    public Crucero()
    {
        this.numeroDeCasillas = 3;
        this.coordenadas = new Punto[this.numeroDeCasillas];
    }
    
}
