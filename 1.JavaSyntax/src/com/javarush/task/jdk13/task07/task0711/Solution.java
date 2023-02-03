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
        String aStringToAdd;

        int counter = 0;
        while (listIterator.hasPrevious() && counter < THIRTEEN) {
            aStringToAdd = listIterator.previous();
            listIterator.remove();
            while (listIterator.hasPrevious()) {
                listIterator.previous();
            }
            listIterator.add(aStringToAdd);
            while (listIterator.hasNext()) {
                listIterator.next();
            }
            counter++;
        }

        System.out.println("ssss");
        strings.stream().forEach(System.out::println);
    }
}

//решение
/*
        for (int i = 0; i < strings.size(); i++) {
            aStringToAdd = strings.remove(strings.size() - 1);
        }
*/

/*

        for (int i = 0; i < 13; i++) {
            String string = strings.remove(4);
            strings.add(0, string);
        }
 */


/*        ListIterator<String> itr = list.listIterator();
        int count = 0;

        while (count++ < 3 && itr.hasNext()) {
            String el = itr.next();
            itr.remove();
            while (itr.hasNext()) {
                itr.next();
            }
            itr.add(el);
            while (itr.hasPrevious()) {
                itr.previous();
            }
        }*/


/*
int counter = 0;

while (counter++ < 3) {
    ListIterator<String> itr1 = list.listIterator(list.size());
    String s = itr1.previous();
    itr1.remove();
    ListIterator<String> itr2 = list.listIterator();
    itr2.add(s);
}
 */