package Träning;

import java.io.*;

public class fileWrite {
    public static void main(String []args){
        try{
        BufferedWriter bw = new BufferedWriter(
            new FileWriter("C:\\Users\\Emelie\\Desktop\\Skolan\\Test\\output.txt"));
         bw.write("Karen\n");
         bw.write("Patricha\n");
         bw.write("Lottie");
         bw.close();

        }catch(Exception ex){
            return;
        }

    }
    
}
