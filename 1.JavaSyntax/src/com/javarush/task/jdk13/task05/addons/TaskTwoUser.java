package com.javarush.task.jdk13.task05.addons;

/*
ы создаете базу данных пользователей для сайта знакомств.

Да вот беда — вы подзабыли в каком порядке их нужно указывать, а технического задания под рукой нет.

Спроектируйте класс User,  у которого будут поля — имя (String) возраст (short) и рост (int).

Создайте для него необходимое количество конструкторов,
чтобы имя, возраст и рост можно было указывать в любом порядке.
 */

public class TaskTwoUser {
    private String name;
    private short age;
    private int height;

    public TaskTwoUser(String name, short age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public TaskTwoUser(String name, int height, short age) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public TaskTwoUser(short age, String name, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public TaskTwoUser(short age, int height, String name) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public TaskTwoUser(int height, String name, short age) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public TaskTwoUser(int height, short age, String name) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public static void main(String[] args) {

    }
}
