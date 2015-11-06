package ArithmeticTable;

/**
 * Class for subtraction calculations
 * @author Matt
 */
public class SubtractionCalculator extends Calculator {

     /**
     * Constructor for the class, passes the variable up to its parent
     * @param s the type of calculator
     */
    public SubtractionCalculator(String s) {
        super(s);
    }

    /**
     * Method that calculates value when  subtraction is performed.
     * @param x the number being subtracted
     * @param y the number being subtracted from.
     * @return  the calculated value.
     */
    @Override
    public float calcValue(int x, int y) {
    float answer;
    answer = y - x;
    return answer;
    }
    
}
