package com.javarush.task.jdk13.task12.task1202;

/* 
Приблизительное значение
*/

public class Solution {

    public static void main(String[] args) {
        int big = 1234567890;

        System.out.println(getDifference(big)); // 46 или -46
    }

    public static int getDifference(int big) {
        float approx = big;
        //напишите тут ваш код
        return (int) approx - big;
    }
}

//2 раза потеря точности