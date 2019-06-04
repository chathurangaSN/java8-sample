package com.sachith;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(10,"Sachith");
        map.put(20,"Malith");
        map.put(30,"Jagath");

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEach(System.out::println);


//        for (Map.Entry m:map.entrySet()) {
//            System.out.println(m.getKey()+","+m.getValue());
//        }


    }

}
