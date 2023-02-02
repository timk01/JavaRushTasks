package com.javarush.task.jdk13.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.ListIterator;

/* 
Удали последнюю строку и вставь её в начало
*/

public class Solution {
    private static final int FIVE = 5;
    private static final int THIRTEEN = 13;

    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < FIVE; i++) {
            strings.add(reader.readLine());
        }
        ListIterator<String> listIterator = strings.listIterator(strings.size());
        ListIterator<String> listIterator2 = strings.listIterator();
        String aStringToAdd;

        int counter = 0;
/*        while (counter < THIRTEEN) {
            aStringToAdd = strings.remove(4);
            //strings.add(0, aStringToAdd);
            *//*strings.add(0, strings.remove(strings.size() - 1));*//*
            counter++;
        }*/

/*
        for (int i = 0; i < strings.size(); i++) {
            aStringToAdd = strings.remove(strings.size() - 1);
        }
*/

/*        while (listIterator.hasPrevious()) {
            //listIterator.previous()
            aStringToAdd = listIterator.previous();
            System.out.println(aStringToAdd);
            listIterator.remove();
            System.out.println("after removal " + strings);
            strings.add(aStringToAdd);
        }*/

        strings.stream().forEach(System.out::println);
    }
}
