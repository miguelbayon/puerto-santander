
/**
 * Write a description of class Barco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Barco
{
    private String matricula;
    private float eslora;
    private int anoFabricacion;

    /**
     * Constructor for objects of class Barco
     */
    public Barco(String matricula, float eslora, int anoFab)
    {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anoFabricacion = anoFab;
    }
    
    /**
     * Return registration
     */
    public String getMatricula()
    {
        return matricula;
    }
    
    /**
     * Return length
     */
    public float getEslora()
    {
        return eslora;
    }
    
    /**
     * Return year of production    
     */
    public int getAnoFabricacion()
    {
        return anoFabricacion;
    }
    
    public abstract int getCoeficienteBernua();
    
    /**
     * Return all the data
     */
    public String toString()
    {
        String datos = "Matricula: " + matricula + "\n";
        datos += "Eslora: " + eslora + "\n";
        datos += "Año de fabricación: " + anoFabricacion + "\n";
        return datos;
    }

}















