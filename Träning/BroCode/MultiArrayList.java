package Träning.BroCode;

import java.util.*;

public class MultiArrayList {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("Bread");
        bakeryList.add("Donuts");
        bakeryList.add("Garlic bread");

        ArrayList<String> produceList = new ArrayList<String>();
        produceList.add("Onion");
        produceList.add("Apple");
        produceList.add("Sallad");

        ArrayList<String> drinksList = new ArrayList<String>();
        drinksList.add("Soda");
        drinksList.add("Sparkling water");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);


        System.out.println(groceryList.get(2).get(1));

    }

}
