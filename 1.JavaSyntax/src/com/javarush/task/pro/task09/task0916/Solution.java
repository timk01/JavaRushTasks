package com.javarush.task.pro.task09.task0916;

/* 
String.format()
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(format("Амиго", 5000));
    }

    public static String format(String name, int salary) {
        return String.format("Меня зовут %2$s. Я буду зарабатывать $%1$d в месяц.", salary, name); //$ отдельно экранитьн е надо
    }
}
