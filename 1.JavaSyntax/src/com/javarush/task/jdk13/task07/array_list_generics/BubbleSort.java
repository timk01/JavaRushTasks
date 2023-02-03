package com.javarush.task.jdk13.task07.array_list_generics;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
        System.out.println("before sorting: " + arrayToString(array));
        simpleBubbleSort(array);
        System.out.println("after sorting: " + arrayToString(array));
        System.out.println();

        int[] array2 = new int[]{64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
        System.out.println("before sorting: " + arrayToString(array2));
        aBitAdvancedBubbleSort(array2);
        System.out.println("after sorting: " + arrayToString(array2));

    }

    private static void simpleBubbleSort(int[] array) {
        boolean isSorted = false;
        int counter = 0;

        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;

                    counter++;
                    isSorted = false;
                }
            }
            System.out.println(Arrays.toString(array));
        }
        System.out.println("counter in simple sort = " + counter);
    }

    private static void aBitAdvancedBubbleSort(int[] array) {
        int length = array.length;
        int counter = 0;

        while (length != 0) {
            int maxIndex = 0;
            for (int i = 1; i < length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;

                    maxIndex = i;
                    counter++;
                }
            }
            System.out.println(Arrays.toString(array));
            length = maxIndex;
        }
        System.out.println("counter in simple sort = " + counter);
    }

    private static String arrayToString(int[] array) { //Arrays.toString(array) очень похож
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}

//https://www.youtube.com/watch?v=aXyMkR8LGEo ((все же мне НАМНОГО сейчас больше нравится этот подход))
//https://www.youtube.com/watch?v=PF7AqefS4MU

//вроде как "классическое" решение
/*
        for (int i = 0; i < array.length-1; i++) { //i < array.length-1 чтобы не сравнивать последний с последним
            for (int j = i+1; j < array.length; j++) { //чтобы не сранивать 1 с первым
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
 */
