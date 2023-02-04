package com.javarush.task.jdk13.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удвой слова
*/

public class Solution {
    private static final int TEN = 10;

    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < TEN; i++) {
            list.add(reader.readLine());
        }

        ArrayList<String> result = doubleValues(list);

        result.stream().forEach(System.out::println);
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i += 2) {
            list.add(i + 1, list.get(i));
        }
        return list;
    }
}

//тоже верно... можно было проще
/*
        ArrayList<String> result = new ArrayList<>();
        for (String string : list) {
            result.add(string);
            result.add(string);
        }
        return result;
 */