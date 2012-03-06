package dip.lab3;

import javax.swing.JOptionPane;

/**
 *
 * @author Cody Auter
 * @course Adv. Java 152 - 135
 * @ver 1.0
 */
public class GUIDisplay implements MessageDisplayer
{
    //Properties
    //Null
    
    //Constructor
    //default (empty)
    
    //Methods
    //Overrides
    public void displayMessage(String message)
    {
        JOptionPane.showMessageDialog(null, message);
    } 
}
