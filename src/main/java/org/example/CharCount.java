package org.example;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharCount {
    public static void main(String[] args) {
        String s="Ab#Ad#cAbd*a";
        //char[] chars=s.toCharArray();
        String result = s.replaceAll("\\W+","");
        String[] st=result.split("\\s");
        Map<Character,Long> newList= s.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(newList);
   newList.forEach((character,count)-> {
       System.out.println("Character :: " + character + "     count  ::" + count);
   });
    }

}
