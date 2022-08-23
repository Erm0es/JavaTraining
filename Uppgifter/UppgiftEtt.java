package Uppgifter;

public class UppgiftEtt {
    public static void main(String[] args) {

        int i = 1;
        int remainder = 0;

        for (i = 1; i <= 100; i++) {
            if (i == 42) {
                System.out.println("Answer to the Ultimate Question of Life, the Universe, and Everything");
            } else if (i % 3 == remainder && i % 5 == remainder) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == remainder) {
                System.out.println("Fizz");
            } else if (i % 5 == remainder) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}