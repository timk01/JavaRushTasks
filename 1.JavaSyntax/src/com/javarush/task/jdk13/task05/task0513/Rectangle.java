package com.javarush.task.jdk13.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    private int top;
    private int left;
    private int width;
    private int height;

    public void initialize() {
        //empty recrangle
    }

    public void initialize(int width) {
        //square
        this.width = width;
        this.height = width;
    }

    public void initialize(int width, int height) {
        //basic rect
        this.width = width;
        this.height = height;
    }

    public void initialize(int top, int left, int width, int height) {
        //basic rect with coords
        initialize(width, height);
        this.top = top;
        this.left = left;
    }

    public void initialize(Rectangle rectangle) {
        Rectangle rectangleCopy = rectangle;
    }

    public static void main(String[] args) {

    }
}
