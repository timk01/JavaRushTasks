package com.javarush.task.jdk13.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строк в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] stringArr = new String[10];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < stringArr.length - 2; i++) {
            stringArr[i] = bufferedReader.readLine();
        }

        for (int i = stringArr.length - 1; i >= 0; i--) {
            System.out.println(stringArr[i]);
        }
    }
}