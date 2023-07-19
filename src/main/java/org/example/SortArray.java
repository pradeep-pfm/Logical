package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortArray {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,4,4,4,4,5,5,5,6};
        List<Integer> newArray= Arrays.stream(arr)
                .boxed()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(newArray);
    }

}