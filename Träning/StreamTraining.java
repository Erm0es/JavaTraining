package Träning;

import java.util.*;
import java.util.stream.Collectors;

//Source -> Filter,Sort,Map -> Collect

/*
-Intermediate Operations : Such as filter, map or sort, return a stream so we can chain multible 
    intermediate operations.
-Terminal Operations: Such as foreacg,collect or reduce are either void or return a non-stream result.
*/

class StreamTraining {
    public static void main (String[] args){

        List<Person> people = new ArrayList<>();

        people.add(new Person("Emelie Wiberg",150));
        people.add(new Person("Kalle Karlsson", 100));
        people.add(new Person("Einar Löv", 90));
        people.add(new Person("Jacob Guld", 5));

        List<Person> hundredClub = people.stream()
            .filter(person -> person.billions >= 100)
            .collect(Collectors.toList());

            hundredClub.forEach(person -> System.out.println(person.name));
    }
    
    static class Person {
        String name;
        int billions;
    
        public Person(String name, int billions){
            this.name = name;
            this.billions = billions;
        }
    }
    
}