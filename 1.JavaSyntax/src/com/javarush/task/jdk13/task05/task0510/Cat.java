package com.javarush.task.jdk13.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    private String name;
    private int age = 1;
    private int weight = 5;
    private String address;
    private String color = "Black";

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, int weight, int age) {
        initialize(name);
        this.weight = weight > 0 ? weight : this.weight; //или if (weight > 0) {this.weight = weight}
        this.age = age > 0 ? age : this.age;
    }

    public void initialize(String name, int age) {
        initialize(name);
        this.age = age > 0 ? age : this.age;
    }

    public void initialize(int weight, String color) {
        this.weight = weight > 0 ? weight : this.weight;
        this.color = color != null ? color : this.color;
    }

    public void initialize(int weight, String color, String address) {
        initialize(weight, color);
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
