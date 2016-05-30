
/**
 * Write a description of class Puerto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puerto
{
    private static final int NUMERO_AMARRES = 4;
    private Alquiler[] alquileres;

    /**
     * Constructor for objects of class Puerto
     */
    public Puerto()
    {
        alquileres = new Alquiler[NUMERO_AMARRES];
    }
    
    /**
     * Add a rent 
     */
    public int addAlquiler(int numeroDias, Cliente cliente, Barco barco)
    {      
        int numeroAmarre = 0;
        int amarreEnElQueAtracaElBarco = -1;
        while((numeroAmarre < NUMERO_AMARRES) && (amarreEnElQueAtracaElBarco == -1)) {
            if (alquileres[numeroAmarre] == null) {
                alquileres[numeroAmarre] = new Alquiler(numeroDias, cliente, barco);
                amarreEnElQueAtracaElBarco = numeroAmarre;
            }
            numeroAmarre++;
        }
        
        return amarreEnElQueAtracaElBarco;
    }
    
    /**
     * Show state of port
     */
    public void verEstadoAmarres()
    {
        for (int i = 0; i < NUMERO_AMARRES; i++) {
            System.out.println("Amarre nº" + i);
            System.out.println(alquileres[i]);
        }
    }
    
    /**
     * Liberate moorage
     */
    public float liquidarAlquiler(int posicion)
    {
        float coste = -1;
        if ((posicion < NUMERO_AMARRES) && 
            (posicion > 0) && 
            (alquileres[posicion] != null)) {
            coste = alquileres[posicion].getCosteAlquiler();
            alquileres[posicion] = null;
        }
        return coste;
    }

}















