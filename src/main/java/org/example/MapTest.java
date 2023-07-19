package org.example;

import java.util.Arrays;
import java.util.List;

public class MapTest {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,5,9,65,6,12);
        list.stream().map(n->n*20).forEach(System.out::println);
    }
}
