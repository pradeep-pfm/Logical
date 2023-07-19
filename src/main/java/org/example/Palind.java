package org.example;


import java.util.Locale;

public class Palind {
    public static void main(String[] args) {
        String s = "abaNitin";
        String str = s.toLowerCase();
        boolean isPalindrome=isPalindrome(str);
        System.out.println("Output is "+isPalindrome);
    }
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            {
                if (start != end)
                    return false;
            }

        }
         return true;
        }
    }


