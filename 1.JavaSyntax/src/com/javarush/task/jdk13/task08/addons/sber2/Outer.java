package com.javarush.task.jdk13.task08.addons.sber2;

public class Outer {
    class Inner {

    }

    public static void main(String[] args) {
        //Inner in = new Inner();
        //нельзя, т.к. иннер нельзя создать без экз. аутера
        //Inner in = Outer.new Inner();
        //это НЕ экземпляр внешнего класса
        Outer.Inner in = new Outer().new Inner();
        // можно (есть экз. внешнего класса)
        //Outer.Inner in2 = new Outer().Inner();
        //нельзя
        //Outer.Inner in2 = Outer().new Inner();
        //нет
    }
}
