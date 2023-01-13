package com.javarush.task.pro.task05.task0511;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());
        multiArray = new int[number][];

        for (int i = 0; i < multiArray.length; i++) {
            number = Integer.parseInt(bufferedReader.readLine());
            multiArray[i] = new int[number];
        }
    }
}

