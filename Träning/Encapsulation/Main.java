package Träning.Encapsulation;

public class Main {
    public static void main(String[] args) {
     Student s = new Student();
     s.setName("Suzie");
     s.setAge(23);

     System.out.println(s.getName());
     System.out.println(s.getAge());
    }
}
