package Träning;

public class ExceptionHandling {
    public static void main(String[] args) {

       try{
        //int myInt = Integer.parseInt("pants");
        int myInt2 = Integer.parseInt("1");

       }catch(Exception e){
        System.out.println("Hey dude, you can't make an int out of that! Stop trying to make it happen.");
       }

       System.out.println("Code running");  
    }
    
}
