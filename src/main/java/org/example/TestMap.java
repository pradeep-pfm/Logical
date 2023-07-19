package org.example;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(101, "Pradeep");
        hm.put(102, "Kumar");
        hm.put(103, "Rahul");
        hm.put(104, "Khushdepp");
        hm.put(105, "Dravid");
        System.out.println(hm);
  hm.forEach((k,v)->System.out.println("Key "+k+ "   value "+v));
        for(Map.Entry<Integer, String> s: hm.entrySet()){
            System.out.println(s);
            Integer key=s.getKey();
            String value=s.getValue();
            System.out.println("===============");
            if (hm.containsKey(value)){
                hm.put(Integer.valueOf(value), hm.get(value)+1);
            }else {
                hm.put(Integer.valueOf(value), String.valueOf(1));
            }
        }
        System.out.println("*********");
        for (Map.Entry<Integer, String> c:hm.entrySet()){
            String value=c.getValue();
            Integer count=c.getKey();
            System.out.println("Value : "+value+" count :"+count );
        }
        }
    }

//identity request
