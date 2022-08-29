package Träning.Classes;

public class Pokemon {
    
    String name;
    int level;

    Pokemon(){
        level = 1;
    }

    Pokemon(String pName, int pLevel){
        name = pName;
        level = pLevel;
    }

    void attack(){
        System.out.print(name + " attack!");
    }
    
}
