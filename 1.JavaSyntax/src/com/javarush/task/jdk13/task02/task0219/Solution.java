package com.javarush.task.jdk13.task02.task0219;

/* 
Вывод текста на экран
*/

public class Solution {
    public static void print3(String text) {
        System.out.printf("%s %s %s\n", text, text, text); //ну или просто в цикле print("text ");
    }

    public static void main(String[] args) {
        print3("window");
        print3("file");
    }
}
