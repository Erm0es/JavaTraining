package Träning;

import java.io.BufferedReader;
import java.io.FileReader;

public class fileReader {
    public static void main(String []args){
        try{
            BufferedReader br = new BufferedReader(
                new FileReader("C:\\Users\\Emelie\\Desktop\\Skolan\\Test\\output.txt"));
                String s;

                while((s = br.readLine()) != null){
                    System.out.println(s);
                }
                br.close();

        }catch(Exception ex){
            return;
        }
    }
    
}
