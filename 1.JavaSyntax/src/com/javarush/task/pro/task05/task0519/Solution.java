package com.javarush.task.pro.task05.task0519;

import java.util.Arrays;
import java.util.Collections;

/* 
Есть ли кто?
*/

public class Solution {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        int[] copyOfOriginalArray = Arrays.copyOf(array, array.length); //не менять прежний массив!!!!
        Arrays.sort(copyOfOriginalArray);
        System.out.println(Arrays.binarySearch(copyOfOriginalArray, element) >= 0);
        Integer[] arr = new Integer[10];
        Collections.sort(arr);
    }
}
