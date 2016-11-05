/**
 * Paquete que contiene las distintas clases que componen el juego principal
 * Contiene a: Armas, ArmaEspecial, ArmaNormal, Barco, Battleship, Crucero, Destructor, Submarino, Jugador, Punto, Tablero.
 */
package Elementos;

/**
 * Clase hija de Arma que disparar e impactara a las coordenadas de un punto ingresado.
 * @author Miguel Sanchez
 * @author Lucio Arias
 */
public class ArmaNormal extends Arma
{
    /**
    * Metodo heredado para disparar el cual solo ataca a las coordenadas del Punto P 
      ingresado en pantalla
    *@param t: Tablero con los barcos.
    *@param p: Punto con coordenadas en donde va a caer la bomba.
    */
    @Override
    public void disparar(Tablero t, Punto p)
    {
        if (t.tablero[p.coorX][p.coorY].equals("\u001B[32mO\u001B[0m"))
        {
            t.tablero[p.coorX][p.coorY] = "\u001B[31m-\u001B[0m";
        }
        else
        {
            t.tablero[p.coorX][p.coorY] = "\u001B[33m*\u001B[0m";
            System.out.println("Disparo fallido"+"\n");
        }
    } 
}
