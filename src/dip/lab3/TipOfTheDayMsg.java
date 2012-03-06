package dip.lab3;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Cody Auter 
 * @course Adv. Java 152 - 135
 * @version 0.5
 */
public class TipOfTheDayMsg implements MessageProvider
{
    //Properties
    private String[] tips;
//
//    /**
//     * Constructor
//     * @param count - Number of tips to hold in String[] tips.
//     * 
//     * Not needed - not flexible
//     */
//    public TipOfTheDayMsg(int count)
//    {
//        if(count < 1) count = 1;
//        else if(count > 5) count = 5;
//        
//        for(int i = 0; i < count; i++)
//        {
//            tips[i] = JOptionPane.showInputDialog(null, "Enter tip " + (i+1));
//        }
//    }

    /**
     * Constructor 2
     *
     * @param tips[] - array of tips for message to display.
     */
    public TipOfTheDayMsg(String[] tips)
    {
        this.tips = tips;
    }

    //Methods
    public String provideMessage()
    {
        return tips[this.getRandom()];
    }

    private int getRandom()
    {
        Random rand = new Random(System.nanoTime());
        //seed generates new rand each time now
        int count = tips.length;
        int num = rand.nextInt(count);
        return num;
    }
}
