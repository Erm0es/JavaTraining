package Träning;

import java.util.*;
import java.util.stream.*;

public class StreamTraining2 {
    public static void main(String[] args){
        
        String[] arr = {"Geeks", "for", "Geeks"};
        Stream<String> stream = Arrays.stream(arr);
        stream.forEach(str -> System.out.print(str + " "));
    }
}
