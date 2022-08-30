package Uppgifter;

import java.util.Scanner;
import java.io.*;

public class FileCrawler {
    public static void main (String [] args){
        Scanner scanner = null;
        Scanner fileScanner = null;

        try{
            System.out.println("Hi! Enter search word:");
    
            scanner = new Scanner(System.in);
            String search = scanner.nextLine();
    
            
            File file = new File("S:\\VisualStudio\\JavaTraining\\Uppgifter\\DocumentFc\\Stupid.txt");
            fileScanner = new Scanner(file);
    
            while(fileScanner.hasNext()){
                if(fileScanner.nextLine().contains(search)){
                    System.out.println(file);
                } else{
                    return;
                }
            }
           
        }catch(FileNotFoundException e){
                System.out.println("File does not exist.");
        }finally{
            if(scanner != null){
                scanner.close();
            }
            if(fileScanner != null){
                fileScanner.close();
            }
          
           
        }
         

    }  

}
