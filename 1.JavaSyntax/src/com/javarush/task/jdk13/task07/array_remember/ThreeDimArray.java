package com.javarush.task.jdk13.task07.array_remember;

public class ThreeDimArray {
    public static void main(String[] args) {
        //задаем булев трёхмерный массив.
        // На этой парковке есть 3 этажа, на каждом из которых можно поместить
        // 2 х5 = 10. машин.По умолчанию все ячейки пусты(false)
        boolean[][][] parkingLot = new boolean[3][2][5];
//приехало две машины и припарковались на нулевом этаже в ячейке [1][0] и [1][3]
        parkingLot[0][1][0] = true;
        parkingLot[0][1][3] = true;

//Выведем массив в консоль
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 5; k++) {
                    System.out.print("arr[" + i + "][" + j + "][" + k + "] = " + parkingLot[i][j][k] + "\t");

                }
                System.out.println();
            }
        }
    }
}

//https://javarush.com/groups/posts/mnogomernye-massivy