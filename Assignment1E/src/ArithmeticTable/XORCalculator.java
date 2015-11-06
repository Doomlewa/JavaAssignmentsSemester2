/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArithmeticTable;

/**
 * Calculator for XOR tables 
 * @author Matt
 */
public class XORCalculator extends Calculator {
    
    /**
     * Constructor that passes in the type to parent constructor
     */
    public XORCalculator() {
        super("^");
    }

       /**
     * Method that calculates value when a XOR is performed.
     * @param x the first number being acted upon.
     * @param y the second number being acted upon.
     * @return  the calculated value.
     */
    @Override
    public float calcValue(int x, int y) 
    {
        float  answer = x ^ y;
        return answer;
    }
}
