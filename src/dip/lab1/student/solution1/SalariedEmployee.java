package dip.lab1.student.solution1;

/**
 * A simple implementation sub-class of Employee. These are low-level classes in
 * the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @course Adv Java 152 - 135
 * @author Cody Auter
 * @version 2.0
 */
public class SalariedEmployee implements Employee
{
    //Properties

    private double annualSalary;
    private double annualBonus;

    /**
     * Convenience constructor. Is this the best way to go?
     *
     * @param annualSalary - the employee's annual salary
     * @param annualBonus - a bonus benefit, if any
     */
    public SalariedEmployee(double annualSalary, double annualBonus)
    {
        setAnnualSalary(annualSalary);
        setAnnualBonus(annualBonus);
    }

    //Overrides
    public final double getAnnualWages()
    {
        return annualSalary + annualBonus;
    }

    //Getters & Setters
    public final double getAnnualBonus()
    {
        return annualBonus;
    }

    public final void setAnnualBonus(double annualBonus)
    {
        this.annualBonus = annualBonus;
    }

    public final double getAnnualSalary()
    {
        return annualSalary;
    }

    public final void setAnnualSalary(double annualSalary)
    {
        this.annualSalary = annualSalary;
    }
}
