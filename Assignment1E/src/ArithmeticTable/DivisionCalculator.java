package ArithmeticTable;

/**
 * Class for division calculations
 * @author Matt
 */
public class DivisionCalculator extends Calculator {

    /**
     * Constructor for the class, passes the variable up to its parent
     */
    public DivisionCalculator() {
        super("/");
    }
    
    /**
     * Method that calculates value when division is performed.
     * @param x denominator
     * @param y numerator
     * @return the calculated value, or exits the program if a divide by zero
     * error occurs.
     */
    @Override
    public float calcValue(int x, int y) throws IllegalArgumentException {
    float answer;
    if (x == 0)
    {
        throw new IllegalArgumentException("divide by zero error");
    }
    answer =  (float) y / x;
    
    return answer;
    }
}
