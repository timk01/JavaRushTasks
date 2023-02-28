package com.javarush.task.jdk13.task08.addons.sber2;

public class Q1 {
    public static void main(String[] args) {
        int i = 0;
        //System.out.println(i++ +); //i++ +
    }
}

//ошибка компиляции

/*
i+++ это i++ + 0, например (именно так трактует по дефолту)
т.е. постинкремент и плюс (сложение) - но с чем ?

или i + ++0;
НЕ путать с унарными +i и -i
 */