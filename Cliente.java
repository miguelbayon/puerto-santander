
/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente
{
    private String nombre;
    private String dni;

    /**
     * Constructor for objects of class Cliente
     */
    public Cliente(String nombre, String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
    }

    /**
     * Return dni
     */
    public String getDni()
    {
        return dni;
    }
    
    /**
     * Return name
     */
    public String getNombre()
    {
        return nombre;
    }
    
    /**
     * Return data of a client
     */
    public String toString()
    {
        return "Nombre: " + nombre + " / Dni: " + dni;
    }
}
