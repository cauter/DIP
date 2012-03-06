package dip.lab3;

/**
 *
 * @author Cody Auter @course Adv. Java 152 - 135
 * @version 1.0
 */
public class Driver
{
    public static void main(String[] args)
    {
        //Tips for array
        String[] tips =
        {
            "Never say never",
            "Don't swim after eating",
            "Mind your elders",
            "Write a UML",
            "Backup your files regularly"
        };

        //Low-level modules
        MessageProvider msg1 = new ConsoleMessage();
        TipOfTheDayMsg msg2 = new TipOfTheDayMsg(tips);
        ConsoleDisplay disp1 = new ConsoleDisplay();
        GUIDisplay disp2 = new GUIDisplay();

        //High-Level modules
        MessengerService courier = new MessengerService(msg1, disp1);

        //Test intial set-up
        courier.handleMessage();

        //Test change of displayer and display
        courier.setOutput(disp2);
        courier.handleMessage();

        //Test change of provider and display
        courier.setInput(msg2);
        courier.handleMessage();
    }
}
