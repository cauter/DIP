package dip.lab1.student.solution1;

/**
 * A high-level class that delegates to employee objects to do the work. Does
 * this class design follow the DIP? If not, fix it.
 *
 * @course Adv Java 152 - 135
 * @author Cody Auter
 * @version 2.0
 */
public class HRService
{
    //Properties
    private Employee employee;
    
    /**
     * Constructor
     * 
     * Requires employee upon creation. Use setEmployee to 
     * change to a new employee.
     */ 
    public HRService(Employee employee)
    {
        setEmployee(employee);
    }
    
    //Methods
    /** 
     * @return total yearly wages for employee
     */
    public double getAnnualWage()
    {
        return employee.getAnnualWages();
    }
    
    public final void setEmployee(Employee e)
    {
        if(e == null) throw new NullPointerException();
        employee = e;
    }
}
