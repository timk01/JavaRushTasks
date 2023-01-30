package com.javarush.task.jdk13.task05.task0520;

/* 
Заполнить класс прямоугольник (Rectangle)
*/


public class Rectangle {
    private int top;
    private int left;
    private int width;
    private int height;

    public Rectangle() {
    }

    public Rectangle(int top, int left) { //0
        this.top = top;
        this.left = left;
    }

    public Rectangle(int top, int left, int width) {
        this(top, left);
        this.width = width;
        this.height = width;
    }

    public Rectangle(int top, int left, int width, int height) {
        this(top, left);
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle rectangle) {
        this(rectangle.top, rectangle.left);
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    public static void main(String[] args) {

    }
}
