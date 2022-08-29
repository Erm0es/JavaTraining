package Träning;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class fileCopy {
    public static void main(String []args){
        try {
            BufferedWriter bw = new BufferedWriter(
                new FileWriter("C:\\Users\\Emelie\\Desktop\\Skolan\\Test\\output-copy.txt"));

            BufferedReader br = new BufferedReader(
                new FileReader("C:\\Users\\Emelie\\Desktop\\Skolan\\Test\\output.txt"));
                String s;
                while((s = br.readLine()) != null){
                    bw.write(s + "\n");
                }
                br.close();
                bw.close();
        }catch(Exception ex){
            return;
        }
    }
        
    
}
