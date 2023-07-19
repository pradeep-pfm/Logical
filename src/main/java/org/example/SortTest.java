package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortTest {
    public static void main(String[] args) {
        int[] numbers={1,8,15,8,4,7,1,5,6,1,15};
       int[] sortedArray= Arrays.stream(numbers)
               .boxed()
               .distinct()   //to remove duplicate
               //.sorted(Comparator.reverseOrder())
               .mapToInt(Integer::intValue)
                       .toArray();
        System.out.println(Arrays.toString(sortedArray));

       // set inteface
        int[] number = {1, 8, 15, 8, 4, 7, 1, 5, 6, 1, 15};
        Integer[] boxedArray = Arrays.stream(number).boxed().toArray(Integer[]::new);

        Set<Integer> distinctSet = new LinkedHashSet<>(Arrays.asList(boxedArray));
        Integer[] distinctArray = distinctSet.toArray(new Integer[0]);

        Arrays.sort(distinctArray, Comparator.reverseOrder());

        // Convert back to int[] if needed
        int[] sortedArrayBySet = Arrays.stream(distinctArray).mapToInt(Integer::intValue).toArray();

        // Print the sorted array
        System.out.println("VAlues are : "+Arrays.toString(sortedArrayBySet));












//                .boxed()
//                .distinct()
//                .sorted(Comparator.reverseOrder());
               // .skip(1)
                ///.findFirst()
              // .get().
               //.toArray();
               // .collect(Collectors.toList());
        //System.out.println(Arrays.toString(sortedArray));
       // System.out.println(Arrays.toString(sortedArray));
    }
}
