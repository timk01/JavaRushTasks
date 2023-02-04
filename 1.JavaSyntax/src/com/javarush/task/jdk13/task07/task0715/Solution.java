package com.javarush.task.jdk13.task07.task0715;

import java.util.ArrayList;
import java.util.Collections;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static final String STRING_TO_ADD = "именно";
    public static int startedPos = 1;
    public static final int STEP = 2;

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings, "мама", "мыла", "раму");
        for (int i = 0; i < strings.size(); i++) {
            strings.add(startedPos, STRING_TO_ADD);
            startedPos += STEP;
        }

        strings.stream().forEach(System.out::println);
    }
}

//can: i += 2 in loop, and i+1

//strings = strings.stream().map(string -> string + "именно").collect(Collectors.toCollection(ArrayList::new));
//не совсем то. будет изменять текущую строку
//(ArrayList::new) ==  (() -> new ArrayList<>())