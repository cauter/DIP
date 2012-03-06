package dip.lab1.instructor.solution1;

/**
 * An implementation of the Employee interface (contract). Note that in this
 * example only the getAnnualWages() method has been chosen as the common
 * method. The other were not chosen for various reasons. Usually you will
 * have many methods that are common. Also, notice that we chose the identifier
 * "getAnnualWages" which works for both SalariedEmployee and HourlyEmployee.
 * That's significant because we had to make a conscious decision to rename
 * the original SalariedEmployee method, which was getAnnualSalary() to 
 * something that works for all sub classes. You'll need to consider the names
 * you give to your common method vary carefully.
 *
 * @author Jim Lombardo, Instructor
 */
public class SalariedEmployee implements Employee {
    private double annualSalary;
    private double annualBonus;

    /** 
     * Default constructor. If you provide this your code will be
     * fragile because there's no guarantee the properties above will be
     * initialized.
     */
//    public SalariedEmployee() {}

    /**
     * Custom constructor. This is better because we guarantee
     * property initialization.
     * @param annualSalary - the employee's annual salary
     * @param annualBonus - a bonus benefit, if any
     */
    public SalariedEmployee(double annualSalary, double annualBonus) {
        setAnnualSalary(annualSalary);
        setAnnualBonus(annualBonus);
    }

    /* Custom implementation of Inteface contract. Therefore, this method
     * is polymorphic (common) to all employess and can be used in the
     * high-level class. The other methods are not part of the contract and
     * therefore can't be used in the high-level class.
     */
    public double getAnnualWages() {
        return annualSalary;
    }

    public double getAnnualBonus() {
        return annualBonus;
    }

    public void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
    
}
