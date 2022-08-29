package Uppgifter;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.*;

public class FileCrawler {
    public static void main (String [] args){
        System.out.println("Hi! Enter search word:");

        Scanner scanner = new Scanner(System.in);
        String search = scanner.nextLine();
        System.out.println(search);
        scanner.close();

        readFile("C:\\Users\\Emelie\\Desktop\\Skolan\\FileCrawler");
    }

    private static void readFile(String filePath){
        File file = new File(filePath);

        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(file);
            while(fileScanner.hasNext()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch(FileNotFoundException e){
            System.out.println("File not found.");
        } finally {
            fileScanner.close();
        }
    }
}
