package com.javarush.task.task10.task1001;

/* 
Задача №1 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        int a = 0;
        int b = a + 46;
        byte c = (byte) (a * b);
        double f = 1234.15;
        long d = (long) (a + f / c + b);
        System.out.println((f / c));
        System.out.println(d);
    }
}

/*
double f = 1. / 0; // то же самое и при  float f = (float) 1. / 0;
если инфинити (а это есть в вещественных числах при делении на нуль) сложить число, будет... инфинити
а если привести к лонгу, будет максимальный лонг, тоже с интом
байт, шорт дают -1
(int) ((char) (f / c)): (char) (f / c) дают символ, который при онверте выдает... +значение
Ну а вообще чар - неотрицательное значение, можно и к чару.
 */