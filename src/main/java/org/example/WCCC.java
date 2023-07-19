package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WCCC {
    public static void main(String[] args) {
        String s="java is best programing for functional java is best for implementing java library is in java security";
        String[] words=s.split("\\s+");
        Map<String,Long> tempList=Arrays.stream(words)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        String secondMost=tempList.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .skip(1)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse("No 2nd highest attampt");
        System.out.printf("2nd Highest Value have :: "+secondMost);
    }
}
