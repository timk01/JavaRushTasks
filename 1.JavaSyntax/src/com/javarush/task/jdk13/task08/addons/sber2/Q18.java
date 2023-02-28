package com.javarush.task.jdk13.task08.addons.sber2;

import java.util.HashMap;
import java.util.Map;

public class Q18 {
    public static void main(String[] args) {
        //Какой из вариантов ответа действителен с учетом следующей декларации?
        Map<String, Double> map = new HashMap<>();
        //map.add("E", 2L); 
        //нету метода эдд в мапе... (вообще никакого)

        //map.put("E", 2L); // нельзя, 2Л
    }
}
