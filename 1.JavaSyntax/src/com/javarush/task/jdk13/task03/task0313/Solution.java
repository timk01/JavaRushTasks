package com.javarush.task.jdk13.task03.task0313;

/* 
Мама мыла раму
*/

public class Solution {
    public static void main(String[] args) {
        String[] arr = new String[]{"Мама", "Мыла", "Раму"};
        //String str = "МамаМылаРаму";
        permutate(arr);
    }

    public static void permutate(String[] arr) {
        permuteIteration(arr, 0);
    }

    private static void permuteIteration(String[] arr, int index) {
        //последняя итерация
        if (index >= arr.length - 1) {
            for (String s : arr) {
                System.out.printf("%s", s);
            }
            System.out.printf("%n");
            return;
        }

        for (int i = index; i < arr.length; i++) {
            String temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;

            permuteIteration(arr, index + 1);

            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }
}

//т.н. "правильное" решение (хотяяяяя), тут даже не исользуется %1$s%2$s%3$s например
/*
String s1 = "Мама";
        String s2 = "Мыла";
        String s3 = "Раму";

        System.out.printf("%s%s%s%n", s1, s2, s3);
        System.out.printf("%s%s%s%n", s1, s3, s2);
        System.out.printf("%s%s%s%n", s2, s1, s3);
        System.out.printf("%s%s%s%n", s2, s3, s1);
        System.out.printf("%s%s%s%n", s3, s1, s2);
        System.out.printf("%s%s%s%n", s3, s2, s1);
 */