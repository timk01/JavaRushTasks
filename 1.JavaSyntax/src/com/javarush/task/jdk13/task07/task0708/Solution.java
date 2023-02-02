package com.javarush.task.jdk13.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.OptionalInt;

/* 
Самое большое число
*/

public class Solution {

    private static ArrayList<Integer> integers = new ArrayList<>();
    public static final int FIVE = 5;

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < FIVE; i++) {
            integers.add(Integer.parseInt(bufferedReader.readLine()));
        }

        OptionalInt max = integers.stream().mapToInt(Integer::intValue).max(); //v -> v is the same as Integer::intValue
        System.out.println(max.getAsInt());
    }
}

//решение на базе массива
/*        Integer[] array = integers.toArray(new Integer[0]);
        Arrays.sort(array);

        System.out.println(array[array.length - 1]);*/

//решение проще всего...
//Collections.max(integers);
