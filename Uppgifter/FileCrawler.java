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
        System.out.println(search);
       
            BufferedReader br = new BufferedReader(
                new FileReader("C:\\Users\\Emelie\\Desktop\\Skolan\\FileCrawler\\Stupid.txt"));
                String s;
                while((s = br.readLine()) != null){
                    System.out.println(s);
                }
                br.close();
        }catch(Exception ex){
            return;
        }

        if(SÖKORD == br){
            System.out.Println(s)
        }
    }  

}
