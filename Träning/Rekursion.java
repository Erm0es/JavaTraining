package Träning;

public class Rekursion {
    public static void main(String[] args){
        System.out.println("summan är: " + sum(6));
    }
    
    private static int sum(int i) {
        if(i == 0){
            return 0;
        }
        
        return sum(i-1) + i;
    }
}
