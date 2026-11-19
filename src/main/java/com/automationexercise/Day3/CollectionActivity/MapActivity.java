package com.automationexercise.Day3.CollectionActivity;

import java.util.HashMap;
import java.util.Map;

public class MapActivity {

    public static void main(String[] args) {
        // 1 - Type code to create a HashMap of key-value pairs
        // where key is id of type String and value is a name
        Map  map = new HashMap();
        map.put("one", "John");
        map.put("two", "Alice");
        map.put("three", "Jessica");
        map.put("four", "Richard");

        // 2 - Call print method to print the map passed as its parameter.
        // (Hint: Notice print() is a non-static method, so create an instance of MapActivity)
        MapActivity mapActivity = new MapActivity();
        mapActivity.print(map);

    }

    void print(Map map) {
        // 3 - Type code to print this map (keys and values)
        System.out.println(map);

    }
}
