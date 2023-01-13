package com.javarush.task.jdk13.task07.array_remember;

import java.util.Arrays;

public class ArrMax {
    public static void main(String[] args) {
        double[] myArray = {11, 5.8, 11.1, 10.9};

        double max = Double.MIN_VALUE;

        for (int i = 0; i < myArray.length; i++) {
            max = Math.max(max, myArray[i]);
        }

        System.out.println(max);

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1; //сравни с ++i, где вообще вся логика съедет
        }

        System.out.println(Arrays.toString(numbers));
    }
}
