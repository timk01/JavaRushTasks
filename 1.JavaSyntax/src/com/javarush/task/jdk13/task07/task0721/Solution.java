package com.javarush.task.jdk13.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Максимальное и минимальное числа в массиве
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        int[] arrayOfInts = new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            arrayOfInts[i] = Integer.parseInt(reader.readLine());
        }

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        for (int i = 0; i < arrayOfInts.length; i++) {
            int number = arrayOfInts[i];
            if (maximum < number) {
                maximum = number;
            }
            if (minimum > number) {
                minimum = number;
            }
        }

        System.out.print(maximum + " " + minimum);
    }
}

//как вариант
/*
        int maximum = numbers[0];
        int minimum = numbers[0];
 */

//см. StreamsArrayList с примерами... что пашет здесь: (Collections.max и остальные- нет или через жопу)

//1.
/*Arrays.sort(arrayOfInts);*/

//2
/*        OptionalInt maximum = Arrays.stream(arrayOfInts).max();
        OptionalInt minimum = Arrays.stream(arrayOfInts).min();
        OptionalInt reduce = Arrays.stream(arrayOfInts).reduce(Integer::min);//(a, b) -> Integer.min(a, b)*/