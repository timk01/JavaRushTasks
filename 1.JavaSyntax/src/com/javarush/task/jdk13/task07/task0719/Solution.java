package com.javarush.task.jdk13.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Вывести числа в обратном порядке
*/

public class Solution {
    public static final int TEN = 10;

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> integers = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < TEN; i++) {
            integers.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = integers.size() - 1; i >= 0; i--) {
            System.out.println(integers.get(i));
        }
    }
}

//можно даже не прогонять через стрим массив
/*        Collections.reverse(integers);
        integers.forEach(System.out::println);*/
