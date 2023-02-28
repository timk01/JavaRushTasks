package com.javarush.task.jdk13.task08.addons.sber;

public class Quiz2 {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("1" + ++i);
        String s = "Hello";
        s.concat(" world");
        System.out.println(s);
    }
}

//11

/*
конкатенация. плюс ++ работает ДО нее. соответственно получается "1" + "1"
 */