package dip.lab1.instructor.solution1;

/**
 * A high-level class that delegates to a polymorphic employee object to do the 
 * work. Many options are presented to get you thinking. But if you read
 * all the comments you will see that only one method and is all that is
 * really needed here. Other programs may need more.
 *
 * @author Jim Lombardo, Instructor
 */
public class HRService {
    // This represents the component object -- the delegate that does
    // the actual work. Somehow this component needs to be initialized, or
    // we could use a method that let's us pass it in. Or, maybe we don't
    // need this at all. Read all the comments below.
    private Employee employee;
    
    /*
     * This guarantees that an employee object will be initialized. It's one
     * way to make our code less fragile. But alternatively we could just
     * create a getAnnualCompensationForEmployee method that takes an
     * employee argument and dispenses with the need for a employee property.
     * Then this kind of constructor is unnecessary.
     */
    public HRService(Employee e) {
        employee = e;
    }
    
    /*
     * The default constructor initializes nothing. If we're going to use it
     * we'd better make sure that we have an employee object to delegate to.
     */
    public HRService() {
        
    }
    
    /* 
     * If we use the property above we'll need a way to initialize it. One
     * way would be to use a setter method, but that would make our design
     * fragile because we would expect this method to be called first, 
     * before retrieving the wages, and there's no guarantee that will happen!
     * 
     * So we would expect that from another class someone would write code
     * like this:
     * 
     * setEmployee(new HourlyEmployee();
     * double wages = getAnnualCompensativeForEmployee()
     * 
     * Notice that the second method has no parameters, therefore, it assumes
     * the employee has already been set -- fragile!
     */
     public void setEmployee(Employee e) {
        if(e == null) {
            throw new NullPointerException();
        }
        
        employee = e;
    }
    
    /*
     * This is dangerous because it assumes the employee object has already
     * been set. Of course, if we use the parameterized constructor above,
     * we could guarantee that (but don't include the default constructor then
     * or you give people a choice).
     */
    public double getAnnualCompensationForEmployee() {
        return employee.getAnnualWages();
    }
    
    /*
     * This is the simplest option. Just pass the employee object which
     * is polymorhic with respect to the getAnnualWages method. No need for
     * any of the stuff above. We just delegate to the passed in employee
     * object. This may not always be the best choice -- sometimes, especially
     * if you need multiple delegate objects like the Copier example, you
     * may want a constructor or setter method to get the delegate objects
     * initialized. But in this simple example, this single method is all we
     * really need!
     * 
     * IMPORTANT: just because you can do this don't assume
     * that it is the only right way to use DIP. If you examine the Copier
     * example you see that we use a constructor instead. That's also correct.
     * What's important is not how we get the delegate into the high-level 
     * class, but that it is polymorphic and all work is done by the delegate.
     */
    public double getAnnualCompensationForEmployee(Employee e) {
        return e.getAnnualWages();
    }
}














