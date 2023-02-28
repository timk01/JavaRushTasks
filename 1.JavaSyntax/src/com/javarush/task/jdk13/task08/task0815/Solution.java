package com.javarush.task.jdk13.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Одинаковые имя и фамилия
*/

public class Solution {
    public static final int TEN = 10;

    public static Map<String, String> createMap() {
        Map<String, String> stringMap = new HashMap<>();
        for (int i = 0; i < TEN; i++) {
            stringMap.put("LastName " + i, "FirstName" + i);
        }
        return stringMap;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int firstNameCounter = 0;
        for (String value : map.values()) {
            if (value.equals(name)) {
                firstNameCounter++;
            }
        }
        return firstNameCounter;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int lastNameCounter = 0;
        for (String key : map.keySet()) {
            if (key.equals(lastName)) {
                lastNameCounter++;
            }
        }
        return lastNameCounter;
    }

    public static void main(String[] args) {

    }
}

/*
Ключ уникален (т.е. совпадает макс 1 раз), значение не уникально
 */

/*
        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            if (stringStringEntry.getKey().equals(lastName)) {
                lastNameCounter++;
            }
        }
 */

/*
for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            if (stringStringEntry.getValue().equals(name)) {
                firstNameCounter++;
            }
        }
 */