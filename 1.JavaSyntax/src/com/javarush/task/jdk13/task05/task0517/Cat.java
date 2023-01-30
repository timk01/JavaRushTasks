package com.javarush.task.jdk13.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    private String name;
    private int age = 1;
    private int weight = 5;
    private String address;
    private String color = "Black";

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int age) {
        this(name);
        if (age > 0) {
            this.age = age;
        }
    }

    public Cat(String name, int weight, int age) {
        this(name, age);
        if (weight > 0) {
            this.weight = weight;
        }
    }

    public Cat(int weight, String color) {
        if (weight > 0) {
            this.weight = weight;
        }
        this.color = color;
    }

    public Cat(int weight, String color, String address) {
        this(weight, color);
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
