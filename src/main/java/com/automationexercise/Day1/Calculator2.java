package com.automationexercise.Day1;

public class Calculator2 {

    private String calculatorType;
    public static final String CALC_TYPE_BASIC = "Basic";

    public Calculator2() {
        this.calculatorType = CALC_TYPE_BASIC;
    }
    // Create a Parameterized constructor accepting calculatorType
    public Calculator2(String calculatorType) {
        this.calculatorType = calculatorType;
    }

    // Create a Getter for CalculatorType
    public String getCalculatorType() {
        return this.calculatorType;
    }

    // Create a Setter for CalculatorType
    public void setCalculatorType(String calculatorType) {
        this.calculatorType = calculatorType;
    }

    // Add
    public int add(int x, int y) {
        int sum = x + y;
        return sum;
    }

    // Subtract (Handles absolute or conditional difference)
    public int subtract(int x, int y) {
        int diff = 0;
        if (x > y) {
            diff = x - y;
        } else {
            diff = y - x;
        }
        return diff;
    }

    // Complete the multiply method to multiply all numbers in an int array
    public int multiply(int[] numbers) {
        int temp = 1;
        // Write your loop here
        for (int n : numbers) {
            temp *= n;
        }
        return temp;
    }

    // Complete the divide method (handle division by zero safely)
    public int divide(int x, int y) {
        int divValue = 0;
        // Write your division logic here
        if (y != 0) {
            divValue = x / y;
        }
        return divValue;
    }
}
