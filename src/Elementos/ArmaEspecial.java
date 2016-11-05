/**
 * Paquete que contiene las distintas clases que componen el juego principal
 * Contiene a: Armas, ArmaEspecial, ArmaNormal, Barco, Battleship, Crucero, Destructor, Submarino, Jugador, Punto, Tablero.
 */
package Elementos;


/**
 * Clase hija de Arma que impactara a las coordenadas de un punto ingresado por pantalla asi como tambien a todas las casillas adyacentes de estas coordenadas. 
 * @author Miguel Sanchez
 * @author Lucio Arias
 */
public class ArmaEspecial extends Arma
{
    /**
    * Variable Privada: Numero de municiones.
    */
    private int numeroMuniciones;
    /**
    * Constructor por defecto que inicializa cada  Arma Especial con un numero de 2 municiones.
    */
    public ArmaEspecial()
    {
        this.numeroMuniciones = 2;
    }
    
    /**
    *Metodo heredado el cual generara el disparo de la arma especial y afectada todas sus casillas adyacentes.
    *@param t: Tablero con los barcos.
    *@param p: Punto con coordenadas en donde va a caer la bomba.
    */
    @Override
    public void disparar(Tablero t, Punto p)
    {
        if (this.numeroMuniciones > 0)
        {
            for(int i=-1; i<=1; i++)
            {
                for (int j=-1; j<=1; j++)
                {
                    if (t.tablero[p.coorX+i][p.coorY+j].equals("\u001B[32mO\u001B[0m"))
                    {
                        t.tablero[p.coorX+i][p.coorY+j] = "\u001B[31m-\u001B[0m";  
                    }              
                    else
                    {
                        t.tablero[p.coorX+i][p.coorY+j] = "\u001B[33m*\u001B[0m";
                    }                     
                }                   
            }
            this.numeroMuniciones -= 1;
        }
        else
            System.err.println("Se acabaron las municiones");
    }
    
}
