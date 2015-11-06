package ArithmeticTable;

/**
 * Calculator for AND tables.
 * @author Matt
 */
public class ANDCalculator extends Calculator {
    
    /**
     * Constructor that passes in the type to parent constructor
     */
    public ANDCalculator() {
        super("&");
    }

       /**
     * Method that calculates value when bitwise AND is performed.
     * @param x the first number being calculated on.
     * @param y the second number being calculated on.
     * @return  the calculated value.
     */
    @Override
    public float calcValue(int x, int y) 
    {
        float  answer = x & y;
        return answer;
    }
    
}
