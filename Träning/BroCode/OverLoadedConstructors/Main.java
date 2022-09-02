package Träning.BroCode.OverLoadedConstructors;

public class Main {
    public static void main(String [] args) {

        Pizza pizza = new Pizza("Crusty dough", "Tomato", "Gouda", "Bacon"); 

        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sause);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping); 
    } 
}
