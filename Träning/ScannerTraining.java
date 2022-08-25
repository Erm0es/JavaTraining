package Träning;

import java.util.Scanner;

public class ScannerTraining {
    public static void main (String [] args){
        System.out.println("What is your name?");
        
        //Type identifier = new type();
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Hello " + name);
    }
    
    
}
