package dip.lab3;

/**
 *
 * @author Cody Auter
 * @course Adv. Java 152 - 135
 * @version 0.5
 */
public class MessengerService
{
    //Properties
    private MessageProvider input;
    private MessageDisplayer output;
    
    //Constructor
    public MessengerService(MessageProvider input, MessageDisplayer output)
    {
        this.setInput(input);
        this.setOutput(output);
    }
    
    //Methods
    private String recieveMessage()
    {
        return input.provideMessage();
    }
    
    private void displayMessage(String msg)
    {
        output.displayMessage(msg);
    }
    
    public final void handleMessage()
    {
        String message = this.recieveMessage();
        displayMessage(message);
    }
    
    //Getters & Setters
    public final MessageProvider getInput()
    {
        return input;
    }

    public final void setInput(MessageProvider input)
    {
        this.input = input;
    }

    public final MessageDisplayer getOutput()
    {
        return output;
    }

    public final void setOutput(MessageDisplayer output)
    {
        this.output = output;
    }
    
}
