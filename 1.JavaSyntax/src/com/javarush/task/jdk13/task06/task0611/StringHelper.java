package com.javarush.task.jdk13.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    private static int FIVE_TIMES = 5;

    public static String multiply(String text) {
        return multiply(text, FIVE_TIMES);
    }

    public static String multiply(String text, int count) {
        StringBuilder stringBuilder = new StringBuilder();
        if (count >= 0) {
            for (int i = 0; i < count; i++) {
                stringBuilder.append(text);
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(multiply("ABC "));
        System.out.println(multiply("ABC ", 3));
    }
}
