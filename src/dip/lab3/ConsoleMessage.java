package dip.lab3;

import java.util.Scanner;

/**
 *
 * @author cauter
 */
public class ConsoleMessage implements MessageProvider
{
    //Properties
    private String message;
    private Scanner keyboard = new Scanner(System.in);

    //Constructor
    public ConsoleMessage()
    {
        setMessage();
    }

    //Methods
    //Overrides
    public String provideMessage()
    {
        return message;
    }

    //Setter
    //Default
    public final void setMessage()
    {
        System.out.println("Please enter your message:");
        message = keyboard.nextLine();
    }

    //Overload
    public final void setMessage(String message)
    {
        this.message = message;
    }
}
