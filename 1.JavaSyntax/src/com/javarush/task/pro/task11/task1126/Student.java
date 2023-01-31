package com.javarush.task.pro.task11.task1126;

/* 
Студент
*/

public class Student {
    protected String name;

    public Student(String name) {
        this.name = name;
    }
}

//а вообще, чушь. поле должно быть приватным и с геттером, если уж на то пошло.