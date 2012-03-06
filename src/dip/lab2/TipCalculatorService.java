package dip.lab2;

/**
 *
 * @author Cody Auter 
 * @course Adv. Java 152 - 135
 * @version 1.0
 */
public class TipCalculatorService
{
    //Properties
    private TipCalculator calc;

    //Constructor
    public TipCalculatorService(TipCalculator tipCalc)
    {
        setTipCalculator(tipCalc);
    }

    //Methods
    public double getTipTotal()
    {
        return calc.getTip();
    }

    //Getter & Setter
    public TipCalculator getTipCalculator()
    {
        return calc;
    }

    public final void setTipCalculator(TipCalculator c)
    {
        this.calc = c;
    }
}
