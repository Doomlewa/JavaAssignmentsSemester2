package ArithmeticTable;

/**
 * The calculator for OR tables
 * @author Matt
 */
public class ORCalculator extends Calculator {
        
    /**
     * Constructor that passes in the type to parent constructor
     */
    public ORCalculator() {
        super("|");
    }

    /**
     * Method that calculates value when an 
     * OR calculation is performed.
     * @param x the first number being acted upon.
     * @param y the second number being acted upon.
     * @return  the calculated value.
     */
    @Override
    public float calcValue(int x, int y) 
    {
        float  answer = x | y;
        return answer;
    }
}
