package com.automationexercise.Day3.CollectionActivity;

import java.util.ArrayList;
import java.util.List;

public class ListActivity {

    public static void main(String[] args) {
        // Add "John", "John", "Harry", and "Daniel" to the list.
        List names =  new ArrayList();
        names.add("john");
        names.add("John");
        names.add("Harry");
        names.add("Daniel");

        print(names);
    }

    static void print(List list) {

        // Notice the order in which elements get printed.
        for (Object name : list) {
            System.out.println(name);
        }
    }
}
