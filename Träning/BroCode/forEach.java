package Träning.BroCode;
//Traversing technuiqe to iterate through the elements in an array/collection.
//+Less steps, +more readable, - less flexible.

import java.util.ArrayList;

public class forEach {
    public static void main(String [] args) {
       
       //ALTERNATIV 1: String[] pets = {"cat", "dog" , "rat", "bird"};
       
       ArrayList<String> pets = new ArrayList<String>();

       pets.add("cat");
       pets.add("dog");
       pets.add("rat");
       pets.add("bird");

       for(String i : pets){
        System.out.println(i);

       }
       
    }
    
}
