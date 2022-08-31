package Träning;

interface WaterBottle {
    String color = "Blue";

    void fillUp();
}

public class Interface implements WaterBottle {
    public static void main(String[] args) {
        System.out.println(color);

        Interface ex = new Interface();
        ex.fillUp();
    }

    @Override
    public void fillUp() {
        System.out.println("The bottle is filled up!");
    }
}
