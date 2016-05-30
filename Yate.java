
/**
 * Write a description of class Yate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Yate extends EmbarcacionDeportiva
{
    private int camarotes;

    /**
     * Constructor for objects of class Yate
     */
    public Yate(int camarote, int potencia, String matricula, float eslora, int anoFab)
    {
        super(potencia, matricula, eslora, anoFab);
        this.camarotes = camarote;
    }

    /**
     * Return coeficiente Bernua
     */
    @Override
    public int getCoeficienteBernua()
    {
        return super.getCoeficienteBernua() + camarotes;
    }
}
