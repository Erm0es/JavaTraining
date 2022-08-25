package Uppgifter;

import java.util.Scanner;

public class FileCrawler {
    public static void main (String [] args){
        System.out.println("Hi! Enter search word:");

        Scanner scanner = new Scanner(System.in);
        String search = scanner.nextLine();
        System.out.println(search);
        scanner.close();
    }
}
