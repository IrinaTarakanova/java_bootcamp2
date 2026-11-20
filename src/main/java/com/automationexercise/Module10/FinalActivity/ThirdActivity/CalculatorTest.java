package com.automationexercise.Module10.FinalActivity.ThirdActivity;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CalculatorTest {

        Calculator calculator = new Calculator();

    //add method test
    @Test
    public void testAdd() {
        int result1 = calculator.add(2, 3);
        assertEquals(5, result1);
    }

    @Test
    public void testAddWithThreeNumbers() {
        int result3 = calculator.add(1, 2, 3);
        assertEquals(6, result3);
    }
    @Test
    public void testAddWithNegativeNumbers() {
        int result4 = calculator.add(-1, -2);
        assertEquals(-3, result4);
    }

    @Test
     public void testAddWithZero() {
        int result2 = calculator.add(4, 0);
        assertEquals(4, result2);
    }
        //subtract method test
        @Test
        public void testSubtract() {
            int result5 = calculator.subtract(5, 3);
            assertEquals(2, result5);
        }
        @Test
        public void testSubtractWithNegativeNumbers() {
        int result6 = calculator.subtract(10, -5);
            assertEquals(15, result6);
        }
        @Test
        public void testSubtractWithZero() {
            int result7 = calculator.subtract(7, 0);
            assertEquals(7, result7);
        }

        //divide method test
    @Test
    public void testDivide() {
        int result8 = calculator.divide(10, 2);
        assertEquals(5, result8);
    }
        //invalid input test for divide method
        @Test
        public void testDivideByZero() {
        int result9 = calculator.divide(10, 0);
        assertEquals(0, result9);
        }


        //multiply methods test with exception handling
    @Test
    public void testMultiply() {
        try {
            int result10 = calculator.multiply(3, 4);
            assertEquals(12, result10);
            int result11 = calculator.multiply(-2, 5);
            assertEquals(-10, result11);
        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
        //multiply method test
        @Test
        public void testMultiplyWithNegativeNumbers() throws InvalidInputException {
            int result12 = calculator.multiply(3, 4);
            assertEquals(12, result12);

        }
    }

