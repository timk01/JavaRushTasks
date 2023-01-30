package com.javarush.task.jdk13.task05.addons;

public class Cat extends Animal {
    String tail;
    static int catsCount = 37;

    public Cat(String brain, String heart, String tail) {
        super(brain, heart); //always first!
        System.out.println("Конструктор класса Cat начал работу (конструктор Animal уже был выполнен)");
        System.out.println("Текущее значение статической переменной catsCount = " + catsCount);
        System.out.println("Первичное значение tail = " + this.tail);
        this.tail = tail;
        System.out.println("Текущее значение tail = " + this.tail);
    }

    public static void main(String[] args) {
        Animal cat = new Cat("Мозг", "Сердце", "Хвост");
//        System.out.println(catsCount);
//        System.out.println(animalCount);
    }
}

/*
A class's static initialization normally happens
 immediately _before_ the first time one of the following events occur:

    an instance of the class is created,
    a static method of the class is invoked,
    a static field of the class is assigned,
    a non-constant static field is used

Порядок:
1. Статические поля класса Parent;
2. Статический блок инициализации класса Parent;
3. Статические поля класса Сhild;
4. Статический блок инициализации класса Child;
5. Нестатические поля класса Parent;
6. Нестатический блок инициализации класса Parent;
7. Конструктор класса Parent;
8. Нестатические поля класса Сhild;
9. Нестатический блок инициализации класса Сhild
10.Конструктор класса Сhild.
 */