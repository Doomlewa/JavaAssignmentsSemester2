package ArithmeticTable;

/**
 * The calculator for addition tables.
 * @author Matt
 */
public class AdditionCalculator extends Calculator {

    /**
     * Constructor that passes in the type to parent constructor
     * @param s the type of calculator to be passed to the parent class.
     */
    public AdditionCalculator(String s) {
        super(s);
    }

       /**
     * Method that calculates value when  addition is performed.
     * @param x the first number being added.
     * @param y the second number being added.
     * @return  the calculated value.
     */
    @Override
    public float calcValue(int x, int y) 
    {
        float  answer = x + y;
        return answer;
    }
}