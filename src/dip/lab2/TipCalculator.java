package dip.lab2;

/**
 *
 * @author Cody Auter
 * @course Adv. Java 152 - 135
 * @version 1.0
 */
public class TipCalculator
{
    //Properties
    private ServiceQuality serviceQuality;
    private final double GOOD_RATE = 0.20;
    private final double FAIR_RATE = 0.10;
    private final double POOR_RATE = 0.05;
    private double fee = 0.0;
    
    /**
     * Constructor
     * Validated.
     * @param fee Fee to be tipped for. Must be greater than 1 cent. ($0.01)
     * @param serviceQualitySymbol Detirmines rate of tip. Please enter g for
     * Good, f for Fair, and p for Poor.
     * @throws IllegalArgumentException if parameters are not valid.
     */
    public TipCalculator(double fee, String serviceQualitySymbol) throws IllegalArgumentException
    {
        setFee(fee);
        setServiceQuality(serviceQualitySymbol);
    }
    
    //Methods
    public double getTip()
    {
        return fee * (1 + getRate());
    }
    
    public double getRate()
    {
        switch(serviceQuality) 
        {
            case GOOD:
                return GOOD_RATE;
            case FAIR:
                return FAIR_RATE;
            case POOR:
                return POOR_RATE;
        }
        return 0.0;
    }
    
    //Getters & Setters
    public final void setFee(double fee)
    {
        if(fee < 0.01)
        {
            throw new IllegalArgumentException();
        }
        this.fee = fee;
    }
    
    public final void setServiceQuality(String symbol)
    {
        if(symbol == null || !symbol.equalsIgnoreCase("g") || 
                !symbol.equalsIgnoreCase("f") || !symbol.equalsIgnoreCase("p"))
        {
            throw new IllegalArgumentException();
        }
        if(symbol.equalsIgnoreCase("g")) serviceQuality = ServiceQuality.GOOD;
        else if(symbol.equalsIgnoreCase("f")) serviceQuality = ServiceQuality.FAIR;
        else serviceQuality = ServiceQuality.POOR;
    }
}
