package com.automationexercise.Day3;

// This program accepts a user name and checks user's validity
// The user name is checked against an array of names.
public class CustomExceptionActivityTest {

    // 1 - main method that calls validateUser() with different names
    public static void main(String[] args) {
        CustomExceptionActivityTest test = new CustomExceptionActivityTest();

        String[] namesToTest = {"John", "Anna", "Stacie", "mike"};

        for (String name : namesToTest) {
            try {
                System.out.print(name + " -> ");
                test.validateUser(name);
            } catch (CustomExceptionActivity e) {
                System.out.println(e.getMessage());
            }
        }
    }

    void validateUser(String name) throws CustomExceptionActivity {
        // Array of names
        String[] validUsers = {"John", "Mike", "Shanti", "Stacie"};
        // Flag stores 1 if a match is found else it should remain 0
        int flag = 0;
        for (int i = 0; i < 4; i++) {
            // 2 - Check if name matches a value in validUsers
            if (validUsers[i].equals(name)) {
                flag = 1;
                break;   // match found, no need to check the rest
            }
        }
        // 3 - If flag is zero, throw the custom exception
        if (flag == 0) {
            throw new CustomExceptionActivity();
        }
        // 4 - Else (flag is one), print welcome message
        else {
            System.out.println("Welcome to Payroll program");
        }
    }
}