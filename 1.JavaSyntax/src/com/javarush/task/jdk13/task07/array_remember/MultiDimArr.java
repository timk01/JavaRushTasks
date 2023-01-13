package com.javarush.task.jdk13.task07.array_remember;

import java.util.Arrays;

public class MultiDimArr {
    public static void main(String[] args) {
        int[][] twoDimArray = new int[3][4];
        twoDimArray[0][0] = 5;//записали значение 5 в ячейку на пересечении нулевой строки и нулевого столбца
        twoDimArray[0][1] = 7; //записали значение 7 в ячейку на пересечении нулевой строки и первого столбца
        twoDimArray[0][2] = 3;
        twoDimArray[0][3] = 17;
        twoDimArray[1][0] = 7;
        twoDimArray[1][1] = 0;
        twoDimArray[1][2] = 1;
        twoDimArray[1][3] = 12;
        twoDimArray[2][0] = 8;
        twoDimArray[2][1] = 1;
        twoDimArray[2][2] = 2;
        twoDimArray[2][3] = 3;

        //int [][] twoDimArray = {{5,7,3,17}, {7,0,1,12}, {8,1,2,3}};
        /*
         * * * *
         * * * *
         * * * *
         */

        System.out.println(twoDimArray[1][2]); //2 row, 3 column

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
        Arrays.deepToString(twoDimArray);

    }
}
