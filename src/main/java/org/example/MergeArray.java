package org.example;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
       int[] a={1,3,5};
       int[] b={4,5,8};
       int[] c=new int[a.length+ b.length];
       for(int i=0;i<a.length;i++){
           c[i]=a[i];
       }
           for (int i=0;i< b.length;i++){
               c[i+a.length]=b[i];
           }

        System.out.println(Arrays.toString(c));
    }

}
