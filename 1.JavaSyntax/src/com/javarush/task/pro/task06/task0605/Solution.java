package com.javarush.task.pro.task06.task0605;

/* 
Правильный порядок
*/

public class Solution {

    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        for (int i = 0, k = array.length - 1; i < array.length / 2; i++, k--) {
            if (array[i] != array[k]) {
                int tmp = array[i];
                array[i] = array[k];
                array[k] = tmp;
            }
        }

        //ну или вообще без доппеременных
/*        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }*/

        // или в лоб
/*        int[] copyArr = Arrays.copyOf(array, array.length);
        for (int i = copyArr.length - 1, k = 0; i >= 0; i--, k++) {
            array[k] = copyArr[i];
        }*/
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
