package Uppgifter;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.*;

public class FileCrawler {
    public static void main (String [] args){
        try{
        System.out.println("Hi! Enter search word:");

        Scanner scanner = new Scanner(System.in);
        String search = scanner.nextLine();

        
        File file = new File("S:\\VisualStudio\\JavaTraining\\Uppgifter\\DocumentFc\\Stupid.txt");
        Scanner fileScanner = new Scanner(file);

        while(fileScanner.hasNext()){
            if(fileScanner.nextLine().contains(search)){
                System.out.println(file);
            } else{
                return;
            }
        }
       
        }catch(FileNotFoundException e){
            System.out.println("File does not exist.");
        }
    }  

}
