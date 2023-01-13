package com.javarush.task.jdk13.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Два массива
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] intArr = new int[10];
        String[] stringArr = new String[10];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < intArr.length; i++) {
            stringArr[i] = bufferedReader.readLine();
            intArr[i] = stringArr[i].length();
            System.out.println(intArr[i]);
        }
    }
}

