package dip.lab1.instructor.solution1;

/**
 * The DIP says we must base our dependencies on abstractions -- pure
 * abstractions. So we need an Interface representing the low-level classes.
 * We say that an interface is a general contract that must be followed by
 * all implementing sub classes.
 *
 * @author Jim Lombardo, Instructor
 */
public interface Employee {

    /**
     * Returns annual wages for any type of employee. Note that each
     * specific type of employee will implement this differently. But
     * since all employee sub classes are guaranteed to have this method
     * because of the contractual obligation to re-declare all abstract
     * methods in the sub classes, we are guaranteed to have polymorphic
     * behavior with respect to this method.
     *
     * @return annual wages for an employee
     */
    public abstract double getAnnualWages();


 

}
