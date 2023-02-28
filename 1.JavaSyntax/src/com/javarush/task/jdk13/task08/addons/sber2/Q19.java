package com.javarush.task.jdk13.task08.addons.sber2;

//Какой из вариантов строк кода перегружает (overload) метод суперкласса?
//public void go()
//только он, по идее

public class Q19 {
    public void go() {

    }

    class Q20 extends Q19 {
        @Override
        public void go() {

        }
    }

    public static void main(String[] args) {

    }
}
