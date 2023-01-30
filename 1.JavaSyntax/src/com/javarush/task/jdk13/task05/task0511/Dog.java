package com.javarush.task.jdk13.task05.task0511;

/* 
Заполнить класс Dog
*/

public class Dog {
    private String name;
    private int height;
    private String color;

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, int height) {
        initialize(name);
        this.height = height;
    }

    public void initialize(String name, int height, String color) {
        initialize(name, height);
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
