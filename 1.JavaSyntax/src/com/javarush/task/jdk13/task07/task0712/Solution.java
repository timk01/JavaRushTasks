package com.javarush.task.jdk13.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* 
Минимальное или максимальное
*/

public class Solution {

    public static ArrayList<String> strings;
    private static final int TEN = 10;

    public static void main(String[] args) throws IOException {
        strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < TEN; i++) {
            strings.add(reader.readLine());
        }
        List<String> arrayOriginal = new ArrayList<>(strings);
        strings.sort(Comparator.comparingInt(String::length));
        int minLength = strings.get(0).length();
        int maxLength = strings.get(strings.size() - 1).length();
        for (String string : arrayOriginal) {
            if (string.length() == minLength || string.length() == maxLength) {
                System.out.println(string);
                break;
            }
        }
    }
}

//в оригинале:
/*
String minSizeElement = strings.get(0);
        int posMinElement = 0;
        String maxSizeElement = strings.get(0);
        int posMaxElement = 0;
        for (int i = 0; i < 10; i++) {
            if (strings.get(i).length() < minSizeElement.length()) {
                minSizeElement = strings.get(i);
                posMinElement = i;
            } else if (strings.get(i).length() > maxSizeElement.length()) {
                maxSizeElement = strings.get(i);
                posMaxElement = i;
            }
        }

        if (posMinElement < posMaxElement) {
            System.out.println(minSizeElement);
        } else {
            System.out.println(maxSizeElement);
        }
 */
