package com.javarush.task.jdk13.task07.array_remember;

public class SkewTwoDimArray {
    public static void main(String[] args) {
//объявляем и создаём массив, указывая только количество строк
        int[][] twoDimArray = new int[5][];

//инициализируем массив, заполняя его массивами разной длины
        twoDimArray[0] = new int[]{1, 2, 3, 4, 5};
        twoDimArray[1] = new int[]{1, 2, 3, 4};
        twoDimArray[2] = new int[]{1, 2, 3};
        twoDimArray[3] = new int[]{1, 2};
        twoDimArray[4] = new int[]{1};
//выведем получившийся непрямоугольный двумерный массив на экран
        printArray(twoDimArray);

        //без создания первого измерения нельзя так сделать:
        //int[][] twoDimArray2 = new int[][4];

        //также нельзя - должно быть заполнено 1 измерение (а с ним можно опускать хоть все остальные)
        //int[][][] threeDimArray = new int[][1][];
        //int[][][] threeDimArray = new int[][][1];
        int[][][] threeDimArray = new int[1][][];
    }

    private static void printArray(int[][] twoDimArray) {
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print(" " + twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}

