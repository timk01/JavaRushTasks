package com.javarush.task.jdk13.task06.addons;

public class SingleTonTest {
    public static void main(String[] args) {
        //Singleton singleton = new Singleton(); //нельзя, конструктор приватный!
        Singleton singleton = Singleton.getInstance(); //можно, SingletonHolder.INSTANCE при этом внутри
        //т.е. обращение к внутреннему (праватному!) классу, точнее его переменной которая содержит ОДИН экземпляр синглтона
    }
}

//https://topjava.ru/blog/rukovodstvo-po-modifikatoru-static-v-java#6