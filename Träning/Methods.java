package Träning;

/*
 istället för:
 
 System.out.println("Welcome to our calculator!");

 int a = 4;
 int b = 10;
 System.out.println(a * b);

 int c = 5;
 int d = 10;
 System.out.println(c * d);

 int e = 6;
 int f = 10;
 System.out.println(e * f);
 */

public class Methods {
    public static void main(String[] args) {
        welcome();
        multiply(4, 10);
        multiply(5, 10);
        multiply(6, 10);
    }
    public static void welcome(){
        System.out.println("Welcome to my calculator!");
    }

    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }

}
