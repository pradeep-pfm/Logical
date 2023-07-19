package org.example;

public class Main {
    public static void main(String[] args) {
        String str = "Hello";
//        char[] charArray = str.toCharArray();
//        for (int i = charArray.length - 1; i >= 0; i--) {
//            System.out.print(charArray[i]);

            for (int i = str.length() - 1; i >= 0; i--) {
                System.out.print(str.charAt(i));
            }
        System.out.println("======");
            StringBuffer sb= new StringBuffer(str);
        System.out.println("direct reverse is : "+sb.reverse());
        }
    }
