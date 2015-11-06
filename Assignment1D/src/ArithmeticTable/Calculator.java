package ArithmeticTable;

/**
 * This is the base class that all calculations extend from.
 * @author Matt
 */
public abstract class Calculator {
    private final String type;
    /**
     * Constructor for a default table calculator. 
     * @param s the type of Calculator being generated
     */
    protected Calculator (String s)
    {
            type = s;
    }
    
    /**
     * Method that displays type of calculator for external use
     * @return the type of the current calculator.
     */
    public String getDescription()
    { 
        return type;
    }
    
    /**
     * An abstract method meant to calculate values
     * @param x the first value
     * @param y the second value
     * @return the calculated value.
     */
    public abstract float calcValue(int x, int y);
}
