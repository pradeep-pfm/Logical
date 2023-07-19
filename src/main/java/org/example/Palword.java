package org.example;

import java.util.Arrays;

public class Palword {
    public static void main(String[] args) {
        String s = "Nitin speaks Malayalam  Nitin is also a good boy.";
        printPalindromes(s);
    }

    public static void printPalindromes(String s){

    String[] words = s.split("\\s+");
        Arrays.stream(words)
                .filter(word ->
    {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(reversed);
    })
                .forEach(System.out::println);
}
}
//        Arrays.stream(words)
//                .filter(w->{
//                    String reversed=new StringBuffer(w).reverse().toString();
//                    return w.equalsIgnoreCase(reversed);
//                })
//                .forEach(System.out::println);

