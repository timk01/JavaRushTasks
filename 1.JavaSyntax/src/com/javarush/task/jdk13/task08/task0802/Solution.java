package com.javarush.task.jdk13.task08.task0802;

import java.util.HashMap;
import java.util.Map;

/* 
Map из 10 пар
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("арбуз", "ягода");
        map.put("банан", "трава");
        map.put("вишня", "ягода");
        map.put("груша", "фрукт");
        map.put("дыня", "овощ");
        map.put("ежевика", "куст");
        map.put("жень-шень", "корень");
        map.put("земляника", "ягода");
        map.put("ирис", "цветок");
        map.put("картофель", "клубень");

        map.forEach((k, v) -> System.out.println(k + " - " + v));

    }
}

//а вот так валидатор не принимает
/*
        Map<String, String> map = Map.of(
                "арбуз", "ягода",
                "банан", "трава",
                "вишня", "ягода",
                "груша", "фрукт",
                "дыня", "овощ",
                "ежевика", "куст",
                "жень-шень", "корень",
                "земляника", "ягода",
                "ирис", "цветок",
                "картофель", "клубень"
        );
 */

/*        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) { //map.entrySet.for shortcut
            System.out.println(stringStringEntry.getKey() + " - " + stringStringEntry.getValue());
        }*/

/*        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator(); //map.entrySet.iterator
        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey() + " - " + next.getValue());
        }*/

//не будет работать (что и логично) - Мапа не юзает интерфейс коллекшн (хотя формально относится к коллекциям)
/*
        Collections.addAll(map, "арбуз", "ягода",
                "банан", "трава",
                "вишня", "ягода",
                "груша", "фрукт",
                "дыня", "овощ",
                "ежевика", "куст",
                "жень-шень", "корень",
                "земляника", "ягода",
                "ирис", "цветок",
                "картофель", "клубень");
 */