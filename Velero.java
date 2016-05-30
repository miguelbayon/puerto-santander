
/**
 * Write a description of class Velero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Velero extends Barco
{
    private int numeroMastiles;

    /**
     * Constructor for objects of class Velero
     */
    public Velero(int numeroMastiles, String matricula, float eslora, int anoFab)
    {
        super(matricula, eslora, anoFab);
        this.numeroMastiles = numeroMastiles;
    }

    /**
     * Get coeficienteBernua
     */
    public int getCoeficienteBernua()
    {
        return numeroMastiles;
    }
    
    /**
     * Return all the data
     */
    public String toString()
    {
        String data = super.toString();
        data += "Número de mástiles: " + numeroMastiles + "\n";
        return data;
    }
}
