package com.javarush.task.jdk13.task07.array_remember;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        //how to create:
        int[] arr1 = new int[8]; //after, fill
        int[] arr2 = new int[]{1, 2, 3}; //create+fill
        int[] arr3 = {1, 2, 3}; //shortcut from 2

        doNothingWithArr(new int[1]);
        doNothingWithArr(new int[]{1});
        //doNothingWithArr({1}); //this is not legal

        int[][] myTwoDimensionalArr = new int[][]{{2, 3}, {3, 4}};
        //Arrays.sort(myTwoDimensionalArr); //for 1 dimesion
        System.out.println(Arrays.deepToString(myTwoDimensionalArr)); //or just .toString(arr) for one dim

        int[] arrayOfInts = new int[]{-10, -5, 5, 3, 10, 200, -2, -7};
        Arrays.sort(arrayOfInts);
        System.out.println(Arrays.binarySearch(arrayOfInts, 3)); //array must be sorted, so it's 4 (index) = -10, -7, -5, -2, 3

        //now, about cats:
        Cat[][] catsArr = new Cat[3][5];
        catsArr[1][2] = new Cat("Smth");
        for (int i = 0; i < catsArr.length; i++) {
            for (int j = 0; j < catsArr[i].length; j++) {
                System.out.println(catsArr[i][j]);
            }
        }

        //Arrays.

        int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};

        int[] fullCopy = Arrays.copyOf(numbers, numbers.length);
        System.out.println("fullCope " + Arrays.toString(fullCopy)); //fullcopy

        int[] paddedCopy = Arrays.copyOf(numbers, numbers.length + 20);
        System.out.println("v " + Arrays.toString(paddedCopy)); //[167, -2, 16, 99, 26, 92, 43, -234, 35, 80, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        int[] numbersCopy = Arrays.copyOf(numbers, 4);
        System.out.println("numbersCopy " + Arrays.toString(numbersCopy)); //[167, -2, 16, 99]

        int[] partlyCopy = Arrays.copyOfRange(numbers, 2, 6);
        System.out.println(Arrays.toString(partlyCopy)); //[16, 99, 26, 92]


        //arrays copmaring
        int[] numbersA = {1, 2, 3};
        int[] numbersA2 = {1, 2, 3};

        System.out.println(Arrays.equals(numbersA, numbersA2)); //numbers.equals(numbers2) doesn't work ofc

        //
        int[][] numbersTwoDim = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[][] numbersTwoDimCopy = Arrays.copyOf(numbersTwoDim, numbersTwoDim.length); //"поверхностное копирование" 2dim array!!!!!
        //если numbersTwoDim.length = мала, будут скопиированы не все ячейки (но успещно); если велика - заполнены значениями по умолчанию

        System.out.println("Равны ли эти двумерные массивы между собой?");
        System.out.println(Arrays.deepEquals(numbersTwoDimCopy, numbersTwoDim));

        System.out.println(Arrays.deepToString(numbersTwoDimCopy));

        int[] x = {11, -2, 3, 0, 999, -20, 8, -20, 99, -20}; //сортировка ЧАСТИ массива (т.е. сортируется с и по) - выглядит... странно

        Arrays.sort(x, 4, 8);
        String str = Arrays.toString(x); // "[11, -2, 3, 0, -20, -20, 8, 999, 99, -20]"
        //!!!
        //QuickSort: N*Log(N)
    }

    private static void doNothingWithArr(int[] arr) {

    }
}
