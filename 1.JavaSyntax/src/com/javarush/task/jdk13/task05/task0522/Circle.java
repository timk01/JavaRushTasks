package com.javarush.task.jdk13.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    private double x;
    private double y;
    private double radius;

    //напишите тут ваш код

    public Circle() {
    }

    public Circle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Circle(double x, double y, double radius) {
        this(x, y);
        this.radius = radius;
    }

    public Circle(double x) {
        this.x = x;
        this.y = x;
    }

    public static void main(String[] args) {

    }
}