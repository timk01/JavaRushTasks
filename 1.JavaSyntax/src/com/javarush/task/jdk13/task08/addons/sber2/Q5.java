package com.javarush.task.jdk13.task08.addons.sber2;

public class Q5 {
    public static void main(String[] args) {

    }

    public static <T> T identity(T t) {
        return t;
    }

    //1
/*    public static T identity(T t) {
        return t;
    }*/

    //оригинальный код
/*    public static T identity(T t) {
        return t;
    }*/
}

//тоже забыл :(

//<T> ПОСЛЕ Т - не пойдет (должно быть после паблик статик)
//? - вайлдкарт, должно быть после типа. с ним чуть сложнее. в целом, когда все ранво что за подтип передается внутри
//https://docs.oracle.com/javase/tutorial/java/generics/upperBounded.html
//https://www.youtube.com/watch?v=K1iu1kXkVoA
