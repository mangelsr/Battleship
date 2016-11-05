/**
 * Paquete que contiene las distintas clases que componen el juego principal
 * Contiene a: Armas, ArmaEspecial, ArmaNormal, Barco, Battleship, Crucero, Destructor, Submarino, Jugador, Punto, Tablero.
 */
package Elementos;

/**
 * Clase Punto que tendra coordenadas que x,y para ubicar los barcos y los ataques en el juego. 
 * @author Miguel Sanchez
 * @author Lucio Arias
 */
public class Punto
{
    /**
     * Variable protegida: Coordenada en X
     * Variable protegida: Coordenada en Y
     */

    protected int coorX;
    protected int coorY;
    /**
     * Constructor que recibe 2 coordenadas y genera el punto con las mismas.
     * @param coorX
     * @param coorY 
     */
    public Punto(int coorX, int coorY)
    {
        this.coorX = coorX;
        this.coorY = coorY;
    }
    /**
     * @return the coorX
     */
    public int getCoorX()
    {
        return coorX;
    }
    /**
     * @return the coorY
     */
    public int getCoorY()
    {
        return coorY;
    }
    /**
     * @param coorX the coorX to set
     */

    public void setCoorX(int coorX)
    {
        this.coorX = coorX;
    }
    /**
     * @param coorY the coorY to set
     */

    public void setCoorY(int coorY)
    {
        this.coorY = coorY;
    }
}
