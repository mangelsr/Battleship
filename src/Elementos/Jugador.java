/**
 * Paquete que contiene las distintas clases que componen el juego principal
 * Contiene a: Armas, ArmaEspecial, ArmaNormal, Barco, Battleship, Crucero, Destructor, Submarino, Jugador, Punto, Tablero.
 */
package Elementos;

import java.util.Random;

/**
 * La Clase Jugador es la clase que implementara la mayoria de los metodos que establecen las otras clases
 * ya que todas estas seran las herramientas del jugador
 * @author Miguel Sanchez
 * @author Lucio Arias
 */
public final class Jugador
{
    /**
    * Variable privada: Nombre del Jugador.
    * Variable privada: Se puede Jugar.
    * Variable privada final: Tablero  t.
    * Variable privada final: Arma especial.
    * Variable privada final: Arma normal.
    * Variable privada final: Barcos disponibles.
    * Variable privada final: Arrego de barcos.
    * Variable privada final: rd - Numero Random.
    */
    private final String nombre;
    private boolean puedeJugar;
    
    private final Tablero t;
    
    private final ArmaNormal armnormal;
    private final ArmaEspecial armespecial;
    
    private int barcosDisponibles = 5;
    
    private final Barco[] barcos = new Barco[5];
    
    private final Random rd = new Random();
    
    /**
     * Constructor del jugador que recibe el nombre y crea al judador con instancias de sus 2 armas
     * y sus 2 tableros con sus barcos ubicados.
     * @param nombre 
     */
    public Jugador(String nombre)
    {
        this.nombre = nombre;
        this.puedeJugar = true;
        
        this.armnormal = new ArmaNormal();
        this.armespecial = new ArmaEspecial();
        
        this.t = new Tablero();
        
        this.crearBarcos();
        this.ubicarBarcos();
    }
    /**
     * @return El armaNormal.
     */
    public ArmaNormal getArmaNormal(){
        return this.armnormal;
    }
/**
     * @return El valor que indica si el jugador puede jugar
     */
    public boolean getpuedeJugar() {
        return this.puedeJugar;
    }
    /**
     * @return the t
     */
    public Tablero getTablero() {
        return this.t;
    }
    /**
     * @return the nombre
     */
    public String getnombre()
    {
        return this.nombre;
    }
    /**
     * @return the armnormal
     */
    public ArmaNormal getArmnormal() {
        return armnormal;
    }
    /**
     * @return the armespecial
     */
    public ArmaEspecial getArmespecial() {
        return armespecial;
    }
    /**
     * Metodo que verifica si han destruido un barco y actualiza el estado de la flota
     */
    public void actualizarFlota()
    {
        for (int i=0; i<=4; i++)
        {
            if (! barcos[i].destruido)
            {
                barcos[i].verificarCasillasAtacadas(t);
                if (barcos[i].destruido)
                {
                    barcosDisponibles -= 1;
                }
            }
        }
        if (this.barcosDisponibles == 0)
            this.puedeJugar = false;
    }
    /**
     * Metodo que crea un arreglo de 5 barcos de los cuales instancia 4(1 de cada tipo) y el ultimo aleatorio. 
     */
    public void crearBarcos(){
        barcos[0] = new Battleship();
        barcos[1] = new Crucero();
        barcos[2] = new Destructor();
        barcos[3] = new Submarino();
        int x = rd.nextInt(4)+1;
        switch(x)
        {
            case 1:
                barcos[4] = new Battleship();
                break;
                
            case 2:
                barcos[4] = new Crucero();
                break;
                
            case 3:
                barcos[4] = new Destructor();
                break;
            case 4:
                barcos[4] = new Submarino();
                break;
        }
    }
    /**
     * Metodo que ubica los 5 barcos por medio de otro metodo definido en la clase Barco.
     */
    public void ubicarBarcos()
    {
        for (int i=0; i <=4; i++)
        {
            t.ubicarBarco(barcos[i]);
        }
    }
    
    /**
     * Funcion que muestra el tablero del jugador con sus barcos incluidos
     * 
     */
    public void mostrarMar()
    {
        System.out.println("Mar de: " + this.nombre);
        this.t.imprimirTablero();
        System.out.println();
    }
    
}
