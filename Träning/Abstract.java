package Träning;

/*Den abstrakta klassen hjälper till att hålla info till andra classer 
men kan inte kallas på direkt*/
abstract class Dog {
    public void bark(){
        System.out.println("Bark!");
    }

    //Den abstrakta classen vet inte vad den ska göra
    public abstract void poop();
}

class Chihuahua extends Dog{
    //Det berättar vi här i en annan klass
    public void poop(){
        System.out.println("Dog pooped!");
    }
}

public class Abstract {
    public static void main(String[] args) {

        Chihuahua chihuahua = new Chihuahua();
        chihuahua.bark();
        chihuahua.poop();
    }
}
