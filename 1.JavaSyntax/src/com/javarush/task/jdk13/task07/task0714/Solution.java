package com.javarush.task.jdk13.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static final int FIVE = 5;

    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < FIVE; i++) {
            strings.add(reader.readLine());
        }
        strings.remove(2);
        int size = strings.size();
        ArrayList<String> stringsCopy = new ArrayList<>(strings);
        Collections.reverse(stringsCopy); //to not touch previous collection
        stringsCopy.stream().forEach(System.out::println);
    }
}

/*
        for (int i = list.size() - 1; i >= 0; i--) {
            String string = list.get(i);
            System.out.println(string);
        }
 */