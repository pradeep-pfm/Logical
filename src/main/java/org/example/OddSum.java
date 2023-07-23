package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OddSum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int  thirdHigh=numbers.stream()
                .filter(n->n%2==1)
//                .mapToInt(Integer::intValue)
//                .sum()
//   OR
        .collect(Collectors.summingInt(Integer::intValue));
        System.out.println("Sum are : "+thirdHigh);
    }
}
