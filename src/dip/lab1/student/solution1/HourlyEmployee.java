package dip.lab1.student.solution1;

/**
 * An implementation sub-class of an Employee. These are low-level classes in
 * the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @course Adv Java 152 - 135
 * @author Cody Auter
 * @version 2.0
 */
public class HourlyEmployee implements Employee
{
    //Properties
    private double hourlyRate;
    private double totalHrsForYear;

    /**
     * Convenience constructor.
     *
     * @param hourlyRate - the rate per hour that the employee is paid
     * @param totalHrsForYear - total hours worked or predicted per year
     */
    public HourlyEmployee(double hourlyRate, double totalHrsForYear)
    {
        setHourlyRate(hourlyRate);
        setTotalHrsForYear(totalHrsForYear);
    }

    //Overrides
    public final double getAnnualWages()
    {
        return hourlyRate * totalHrsForYear;
    }
    
    //Getters & Setters
    public final double getHourlyRate()
    {
        return hourlyRate;
    }

    public final void setHourlyRate(double hourlyRate)
    {
        this.hourlyRate = hourlyRate;
    }

    public final double getTotalHrsForYear()
    {
        return totalHrsForYear;
    }

    public final void setTotalHrsForYear(double totalHrsForYear)
    {
        this.totalHrsForYear = totalHrsForYear;
    }
}
