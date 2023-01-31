package com.javarush.task.jdk13.task06.addons;

public class Singleton {
    private Singleton() {
    }

    private static class SingletonHolder { //private!
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}