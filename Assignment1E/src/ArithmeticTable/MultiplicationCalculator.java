/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArithmeticTable;

/**
 * The calculator for Multiplication Tables
 * @author Matt
 */
public class MultiplicationCalculator extends Calculator {

     /**
     * Constructor that passes in the type to parent constructor
     */
    public MultiplicationCalculator() {
        super("*");
    }
    
    /**
     * Method that calculates value when  multiplication is performed.
     * @param x the first number being multiplied.
     * @param y the second number being multiplied.
     * @return  the calculated value.
     */
    @Override
    public float calcValue(int x, int y) {
    float answer;
    answer = x * y;
    return answer;
    }
    
}
