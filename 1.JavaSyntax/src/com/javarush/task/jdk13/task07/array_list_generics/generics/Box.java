package com.javarush.task.jdk13.task07.array_list_generics.generics;

public class Box<T extends Garbage, S> { //T or S cannot be ?
    private T firstItem;
    private S secondItem;

    public Box(T firstItem, S secondItem) {
        this.firstItem = firstItem;
        this.secondItem = secondItem;
    }

    public double getItemWeigth() {
        //return firstItem == null ? 0 : firstItem.getWeigth();
        //here compilator cannot define what IS T if T firstItem
        return firstItem == null ? 0 : firstItem.getWeight();
        //T extends Garbage now it can (Garbage and below)
    }

    public T getFirstItem() {
        return firstItem;
    }

    public S getSecondItem() {
        return secondItem;
    }
}
