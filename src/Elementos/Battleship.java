/**
 * Paquete que contiene las distintas clases que componen el juego principal
 * Contiene a: Armas, ArmaEspecial, ArmaNormal, Barco, Battleship, Crucero, Destructor, Submarino, Jugador, Punto, Tablero.
 */
package Elementos;

/**
 * Clase hija de Barco la cual tendra 4 casillas como tamaño en el tablero.
 * @author Miguel Sanchez
 * @author Lucio Arias
 */
public class Battleship extends Barco
{
    /**
     * Constructor de Submarino por defecto con los valores iniciales de su padre Barco 
     * mas un numero de casillas y las coordenadas iniciales que tendra en el tablero.
     */
    
    public Battleship()
    {
        this.numeroDeCasillas = 4;
        this.coordenadas = new Punto[this.numeroDeCasillas];
    }
   
}
