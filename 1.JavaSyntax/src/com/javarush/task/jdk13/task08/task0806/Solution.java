package com.javarush.task.jdk13.task08.task0806;

import java.util.HashMap;
import java.util.Map;

/* 
Коллекция Map из Object
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", 56L);
        map.put("Food", '3');
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double) 123);

        map.forEach((k, v) -> System.out.println(k + " - " + v));

    }
}

//абы что,
//new Long(56)
//new Character('3')
//deprecated

//null.toString() ессно нельзя

/*
        for (Map.Entry<String, Object> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
 */
