package com.javarush.task.pro.task09.addons;

public class StringPadding {
    public static void main(String[] args) {
        int i = 1;
        String s = String.format("%04d", i);
        System.out.println(s);
    }
}
