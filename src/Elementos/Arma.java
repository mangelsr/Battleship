/**
 * Paquete que contiene las distintas clases que componen el juego principal
 * Contiene a: Armas, ArmaEspecial, ArmaNormal, Barco, Battleship, Crucero, Destructor, Submarino, Jugador, Punto, Tablero.
 */
package Elementos;

/**
 * La clase Arma es la case padre para las 2 tipos de armas que tienen los barcos
 * @author Miguel Sanchez
 * @author Lucio Arias
 */
public abstract class Arma
{
    /**
     * Metodo abstracto que recibira el tablero donde se desarrolla el juego,
     * Un punto con coordenadas x,y para ubicar donde sera el disparo y
     * Un tablero muestra que sera el que se muestra en pantallas 
     * @param t: Tablero de buques
     * @param p: Punto con coordenadas x,y
    */
    public abstract void disparar(Tablero t, Punto p);
}
