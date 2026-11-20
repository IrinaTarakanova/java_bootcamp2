package com.automationexercise.Module10.FinalActivity.ThirdActivity;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) {
        try {
            // code fails if b is 0, so we need to catch the exception
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: cannot divide by zero");
            return 0;
        }
    }

    public int multiply(int a, int b) throws InvalidInputException {
        if (a < 0 || b < 0) {
            throw new InvalidInputException("Numbers must not be negative");
        }
        return a * b;
    }
}
