package ArithmeticTable;

/**
 * The calculator for addition tables.
 * @author Matt
 */
public class AdditionCalculator extends Calculator {

    /**
     * Constructor that passes in the type to parent constructor
     */
    public AdditionCalculator() {
        super("+");
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