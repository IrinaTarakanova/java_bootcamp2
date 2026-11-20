package com.automationexercise.Module10.FinalActivity.FifthActivity;

import java.util.HashMap;

public class ElectronicItemDetails {

    static void main() {
        HashMap<String, Double> itemHashMap = new HashMap<>();;
        itemHashMap.put("TV", 500.00);
        itemHashMap.put("Refrigerator", 800.00);
        itemHashMap.put("Washing Machine", 600.00);
        itemHashMap.put("Laptop", 1000.00);

        System.out.println("Price of TV: " + returnPriceOfItem(itemHashMap, "TV"));
        System.out.println("Price of Refrigerator: " + returnPriceOfItem(itemHashMap, "Refrigerator"));
        System.out.println("Price of Washing Machine: " + returnPriceOfItem(itemHashMap, "Washing Machine"));
        System.out.println("Price of Laptop: " + returnPriceOfItem(itemHashMap, "Laptop"));
    }


    public static double returnPriceOfItem(HashMap<String, Double> itemHashMap, String name) {
        return itemHashMap.get(name);
    }

}
