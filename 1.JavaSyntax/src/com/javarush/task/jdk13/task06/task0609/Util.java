package com.javarush.task.jdk13.task06.task0609;

/* 
Расстояние между двумя точками
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(Math.subtractExact(x2, x1), 2) + Math.pow(Math.subtractExact(y2, y1), 2));
    }

    public static void main(String[] args) {

    }
}
