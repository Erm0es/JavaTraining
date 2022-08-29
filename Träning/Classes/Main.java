package Träning.Classes;

public class Main {
    public static void main(String[] args){
        Pokemon p1 = new Pokemon();
        p1.name = "Pikachu";
        p1.level = 10;

        System.out.println(p1.name + " " + p1.level);

        Pokemon p2 = new Pokemon();
        p2.name = "Eevee";
        p2.level = 20;

        p2.attack();

        Pokemon p3 = new Pokemon("Bulbasaur",25);

        System.out.println(p3.level);
        p3.attack();

        Pokemon p4 = new Pokemon();
        System.out.println(p4.level);

    }
    
}
