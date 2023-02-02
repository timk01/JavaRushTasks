package com.javarush.task.jdk13.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая короткая строка
*/

public class Solution {
    public static final int FIVE = 5;

    public static void main(String[] args) throws Exception {
        ArrayList<String> stringList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < FIVE; i++) {
            stringList.add(reader.readLine());
        }

        stringList.sort((first, second) -> Integer.compare(first.length(), second.length()));

        String min = stringList.get(0);
        for (String s : stringList) {
            if (s.length() == min.length()) {
                System.out.println(s);
            }
        }

/*        for (int i = 0; i < stringList.size() - 1; i++) {
            if (stringList.get(i).length() == stringList.get(i + 1).length()) {
                System.out.println(stringList.get(i + 1));
            }
        }*/
    }
}

//гениально, блядь
//int length = Collections.min(stringList).length();

//мое решение
//stringList.sort((first, second) -> Integer.compare(first.length(), second.length()));
// stringList.sort(Comparator.comparingInt(String::length)); //o -> o.length() - проще
// НО! у нас же может быть 2 равных по длине стринга

//stringList.stream().filter(i -> Collections.frequency(stringList, i) > 1).forEach(System.out::println);
//не проходит валидатором

/*
        int minStringLength = strings.get(0).length();
        for (String string : strings) {
            if (string.length() < minStringLength) {
                minStringLength = string.length();
            }
        }

        for (String string : strings) {
            if (string.length() == minStringLength) {
                System.out.println(string);
            }
        }
 */