package org.example;

import java.util.HashMap;

public class WC {
    public static void main(String[] args) {
        String s = "microservices is good for Application development and good for future extension";
        char[] chards = s.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char c : chards)
            if (hm.containsKey(c)) {

                hm.put(c,hm.get(c)+1);
            }else{
                hm.put(c,1);
            }
        System.out.println("Duplicate Words are :"+hm);
        for(char c: hm.keySet()) {
            if (hm.get(c) > 1) {
            System.out.println("duplicate are :  "+c);

        }
    }
}
}
//        //String[] words = s.split("\\s");
//        char[] chars = s.toCharArray();
//        HashMap<Character, Integer> hashMap = new HashMap<>();
//        for (char c : chars)
//            if (hashMap.containsKey(c)) {
//
//                hashMap.put(c, hashMap.get(c) + 1);
//            } else {
//                hashMap.put(c,1);
//            }
//        System.out.println(" Duplicate character are : " + hashMap);
//    }
//}
//        for(String h:hashMap){
//            if(h==null)
//                hashMap.put(h, hashMap.get()+1);{
//            }else()
//        }
//        System.out.println(words.toString());
//    }
//}
