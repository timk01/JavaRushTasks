package com.javarush.task.jdk13.task08.addons.sber2;

public class Q3 {
    public static void main(String[] args) {
        //Какие из утверждений верны? (сомпаратор и компейр)
        //верно:
        //compare принимает ДВА парметра метода
        //compare метод интерфейса Comparator

        //Comparable - java.lang
        //Comparator - java.util

        //запомнить легко. требуется стндартынй метод - он уже включен в сортировку...
        //требуется нестандартный - импорти пакет
        /*
        Java compiler imports java. lang package internally by default.
        It provides the fundamental classes that are necessary to design a basic Java program.
         */
    }
}

//забыл, пришлось гуглить

//https://vertex-academy.com/tutorials/ru/interfejsy-comparable-comparator-java/
//https://www.javatpoint.com/difference-between-comparable-and-comparator

/*
В Comparable ОДИН compareTo(T o) - возвращает инт, и его мы переопределеяем когда хотим "стандартно" сравнить объекты
компейрТу разумеется один. (natural comparison method)
Can you have two compareTo methods?
No you cannot, but you can create a separate Comparator for each ordering.

Comparator:
Как сказано выше, в компараторе - в каждой реализации может быть свяо реализация по чему сравнивать объекты
(будь то цена, площать, время постройки и пр).
compare(O o1, O o2) сранивает 2 объекта.
 */