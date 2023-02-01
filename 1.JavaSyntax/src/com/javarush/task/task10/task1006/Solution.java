package com.javarush.task.task10.task1006;

/* 
Задача №6 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        double d = (short) 2.50256e2d; //250
        char c = (short) 'd'; // это... d (100). или если дальше делить на него, то 150000/100, или 1500 ?
        short s = (short) 2.22; //2
        int i = 150000;
        float f = 0.50f;
        double result = f + (i / c) - (d * s) - 500e-3; //0.5 + 1500.0 - 500 - 0.5
        System.out.println("result: " + result);
    }
}

//100.0 is 1E2 --> 1.0*10^2
//16 is 1.6E1 --> 1.6*10^1

//(short) 2.50256e2d --> 2.50256*10^2, d = double precision exponent... или 250.256
//это 250

//мой коммент по задачам 2 и 3
//https://javarush.com/quests/lectures/questsyntax.level10.lecture04

//500e-3 это 500*10^-3, или 500*(1/1000), или 0.5