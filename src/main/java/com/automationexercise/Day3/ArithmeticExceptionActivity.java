package com.automationexercise.Day3;

// Needs to be completed
public class ArithmeticExceptionActivity {
    public static void main(String[] args) {
        ArithmeticExceptionActivity obj = new ArithmeticExceptionActivity();
        obj.catchMe(10, 0);
        obj.catchMe(10, 2);
    }


    void catchMe(int num1, int num2) {
        // The following code results in an Exception.
        // 3 - Identify the exception and write code to handle this exception.
        try {
            int result = num1 / num2;
            System.out.println("The result is :" + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
        }
        // 4 - After handling the exception, write a finally block which
        // prints a message "Thank you for using this program."
        finally {
            System.out.println("Thank you for using this program.");
        }
    }
}