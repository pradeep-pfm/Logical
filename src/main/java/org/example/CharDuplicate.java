package org.example;

import java.util.HashMap;

public class CharDuplicate {
    public static void main(String[] args) {
        String s = "racecar";
        char[] word = s.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char c : word) {
            if(hm.containsKey(c)) {
                hm.put(c, hm.get(c) + 1);
            }
            else {
                hm.put(c,1);
            }
            //System.out.println(hm);
for (char c1: hm.keySet())
    if(hm.get(c)>1){
        System.out.println(hm);
    }

        }
    }
}
