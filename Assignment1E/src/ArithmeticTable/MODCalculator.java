/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArithmeticTable;

/**
 * Calculator for MOD tables
 * @author Matt
 */
public class MODCalculator extends Calculator {
    
    /**
     * Constructor that passes in the type to parent constructor
     */
    public MODCalculator() {
        super("%");
    }

    /**
     * Method that calculates value when a 
     * MOD calculation is performed.
     * @param x the denominator.
     * @param y the numerator.
     * @return  the calculated value.
     */
    @Override
    public float calcValue(int x, int y) 
    {
        float  answer = y % x;
        return answer;
    }
}
