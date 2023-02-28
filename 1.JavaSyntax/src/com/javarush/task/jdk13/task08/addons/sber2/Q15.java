package com.javarush.task.jdk13.task08.addons.sber2;

public class Q15 {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("1" + ++i);
    }
}

//11

/*
конкатенация. плюс ++ работает ДО нее. соответственно получается "1" + "1"
 */