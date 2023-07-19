package org.example;

import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;


public class JDK8 {
    public static void main(String[] args) {

        int[] arr1 = {2, 4, 7};
        int[] arr2 = {1, 2, 5};

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int num : arr1) {
            arrayList.add(num);
        }
        for (int num : arr2) {
            arrayList.add(num);
        }
        Collections.sort(arrayList);
//        arrayList.add(arr1);
//        arrayList.add(arr2);
        //Collections.sort(arrayList);
        System.out.println(arrayList);
        //int[] arr=arrayList.stream().toArray(Integer[]::new);
        List<Integer> list = arrayList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(list);


//
//        String s="axis";
//       for(int i=0;i<=s.length();i++){
//           int a=
//
//       }
//
        Predicate<Integer> predTest = i -> (i < 18);
        System.out.println(predTest.test(11));

        Supplier<LocalDateTime> ld = () -> LocalDateTime.now();
        LocalDateTime time = ld.get();
        System.out.println(time);
    }

    List<Integer> lis = Arrays.asList(1, 4, 9, 7, 65, 12);
    List<Integer> greaterThan5 = lis.stream()
            .filter(num -> num > 5)
            .collect(Collectors.toList());

}
//    List<Integer> arrList = lis.stream()
//            .filter(x -> x > 5)
//            .toList();
//}

//    {
//        for (Integer data : arrList) {
//            {
//                if (data > 5) {
//                }
//                System.out.println(data);
//            }
//        }
//
//    }


