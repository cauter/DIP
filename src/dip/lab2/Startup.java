package dip.lab2;

// An useful import if you need it.
import java.text.NumberFormat;
// Another useful import if you need it.
import javax.swing.JOptionPane;

/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class. 3. Pass one of your
 * calculator instances to the high-level class and check the results. 4. Now
 * switch to a different calculator instance and pass that to the high-level
 * class. Did it work? Are the low-level instances interchangeable? The DIP
 * requires this.
 *
 * @author Cody Auter 
 * @course Adv. Java 152 - 135
 * @version 1.0
 */
public class Startup
{

    public static void main(String[] args)
    {
        //Variables
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        ServiceQuality g = ServiceQuality.GOOD;
        ServiceQuality f = ServiceQuality.FAIR;
        ServiceQuality p = ServiceQuality.POOR;

        //Low-level modules
        TipCalculator food1 = new FoodServiceTipCalculator(g, 50);
        TipCalculator food2 = new FoodServiceTipCalculator(f, 72.25);
        TipCalculator food3 = new FoodServiceTipCalculator(p, 26.3);

        TipCalculator bag1 = new BaggageServiceTipCalculator(g, 2);
        TipCalculator bag2 = new BaggageServiceTipCalculator(f, 1);
        TipCalculator bag3 = new BaggageServiceTipCalculator(p, 1);

        //Put into an array
        TipCalculator[] tipTo =
        {
            food1, food2, food3, bag1, bag2, bag3
        };

        //High-level module
        TipCalculatorService tipper = new TipCalculatorService(food1);

        //Test input/output via loop
        for (int i = 0; i < tipTo.length; i++)
        {
            tipper.setTipCalculator(tipTo[i]);
            System.out.println("Service Attendant " + (i + 1)
                               + "'s tip: " + 
                               nf.format(tipper.getTipTotal()));
        }
    }
}
