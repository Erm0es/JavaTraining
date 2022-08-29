package Uppgifter;

import java.util.Scanner;
import java.io.*;
import java.io.FileReader;

public class FileCrawler {
    public static void main (String [] args){

    readFile("S:\\VisualStudio\\JavaTraining\\Uppgifter\\DocumentFc\\stupid.txt");

    }  

    public static void readFile(String filePath){
        Scanner scanner = null;

        System.out.println("Hi! Enter search word:");
        scanner = new Scanner(System.in);
        String search = scanner.nextLine();

        try{
            BufferedReader br = new BufferedReader(
                new FileReader(filePath));
                String s;

                while((s = br.readLine()) != null){
                    if(search.contains(s)){
                        System.out.println(filePath);
                    }else{
                        System.out.println("STUPIDSTUPID");
                    }
                    
                } 
                br.close();
                  
            }catch(Exception e){
                System.out.println("File does not exist.");
            }finally{
                if(scanner != null){
                    scanner.close();
                }
            }

    }

}
