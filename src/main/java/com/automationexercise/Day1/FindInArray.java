package com.automationexercise.Day1;

public class FindInArray {
    static void main() {
        int[] array = {10, 12, 3, 22, 5};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("The maximum value in the array is: " + max);
    }
}
