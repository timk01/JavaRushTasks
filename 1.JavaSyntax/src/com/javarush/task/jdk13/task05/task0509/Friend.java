package com.javarush.task.jdk13.task05.task0509;

/* 
Заполнить класс Friend
*/

public class Friend {
    private String name;
    private int age;
    private char sex;

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, int age) {
        initialize(name);
        this.age = age;
    }

    public void initialize(String name, int age, char sex) {
        initialize(name, age);
        this.sex = sex;
    }

    public static void main(String[] args) {

    }
}
