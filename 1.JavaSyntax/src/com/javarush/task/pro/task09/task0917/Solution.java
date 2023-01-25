package com.javarush.task.pro.task09.task0917;

/* 
String pool
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        String first = new String("JavaRush");
        String second = new String("JavaRush");
        String third = new String("javarush");
        System.out.println(equal(first, second));
        System.out.println(equal(second, third));
        Map<Integer, String> aMap = new HashMap<>();
    }

    public static boolean equal(String first, String second) {
        if (((first == null || second == null)) || first.length() != second.length()) {
            return false;
        }
        if (first == second) {
            return true;
        }
        char[] firstArr = first.toCharArray();
        char[] secondArr = second.toCharArray();
        for (int i = 0; i < firstArr.length; i++) {
            if (firstArr[i] != secondArr[i]) {
                return false;
            }
        }
        return true;
    }
}

//решение... внезапно: добавит строку в пул, если ее нет, вернет ссылку. т.е. в 1 случае добавит (предполагаем что ее там нет)
//во втором вернет ссылку. а = сравнивает ссылки. да уж.
//return first.intern() == second.intern();