package com.javarush.task.jdk13.task06.task0612;

/* 
Класс Calculator
*/

public class Calculator {
    public static int plus(int a, int b) {
        return Math.addExact(a, b);
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        return Math.subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        return Math.multiplyExact(a, b);
    }

    public static double division(int a, int b) {
        //напишите тут ваш код
        return (double) a / b;
    }

    public static double percent(int a, int b) {
        //напишите тут ваш код
        return (double) b * a / 100;
    }

    public static void main(String[] args) {
        System.out.println(percent(4, 50));
    }
}

//vartiant
//(a * b * 1.0) / 100