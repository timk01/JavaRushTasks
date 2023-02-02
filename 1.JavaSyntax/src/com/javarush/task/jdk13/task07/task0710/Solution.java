package com.javarush.task.jdk13.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
10 строчек в начало списка
*/

public class Solution {
    public static final int TEN = 10;

    public static void main(String[] args) throws Exception {
        ArrayList<String> aList = new ArrayList<String>(); // List<String> aList - не пропускает
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < TEN; i++) {
            aList.add(0, reader.readLine());
        }
        aList.stream().forEach(System.out::println);
    }
}
