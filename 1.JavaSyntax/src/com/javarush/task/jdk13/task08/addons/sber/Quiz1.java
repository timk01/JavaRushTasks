package com.javarush.task.jdk13.task08.addons.sber;

public class Quiz1 {
    public static void main(String[] args) {
        String s1 = "String";
        String s2 = new String(s1);
        String s3 = new String("s1");
        if (s1 == s2) {
            System.out.println("s1 == s2");
        }
        if (s1.equals(s2)) {
            System.out.println("s1.equals(s2)");
        }
    }
}

//"s1.equals(s2)"

/*
s1 == s2 сравнивает ссылки (1 в стрингпуле, вторая в куче); и хотя 2 вообще-то является КОПИЕЙ, они разные
(ну и да, стринг-то иммутабелен)
екуалс сравнивает посимвольно, потому
 */

/*
nitializes a newly created String object so that it represents the same sequence of characters as the argument;
in other words, the newly created string is a copy of the argument string. Unless an explicit copy of original is needed,
use of this constructor is unnecessary since Strings are immutable.
 */