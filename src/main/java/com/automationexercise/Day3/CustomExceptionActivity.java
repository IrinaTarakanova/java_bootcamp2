package com.automationexercise.Day3;

// Custom checked exception: extends the Exception class
public class CustomExceptionActivity extends Exception {

    @Override
    public String getMessage() {
        return "You are not allowed to use this program";
    }
}
