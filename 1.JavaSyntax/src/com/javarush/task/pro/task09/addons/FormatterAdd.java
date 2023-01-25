package com.javarush.task.pro.task09.addons;

import java.util.Date;

public class FormatterAdd {
    static String name = "Amigo"; //if just non-static, cannot be referenced from psvm (static context)
    static int age = 12;
    static String friend = "Diego";
    static int weight = 200;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFriend() {
        return friend;
    }

    public void setFriend(String friend) {
        this.friend = friend;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static void main(String[] args) {
        String formattedInfo = String.format("Age=%d, Name=%s", age, name);
        System.out.println(formattedInfo);
        System.out.printf("Age=%d, Name=%s", age, name); //printf(     @NotNull String format, Object... args )

        int width = 20;
        int height = 10;
        System.out.printf("Width=%d, Height=%d%n", width, height);
        Date date = new Date();
        System.out.printf("Width=%d, doubleMass=%f, date=%tT", width, 20.0, date);
        System.out.printf("hours %tH: minutes %tM: seconds %tS%n", date, date, date);
        //https://www.baeldung.com/java-printstream-printf
        String s = String.format("a=%3$d, b=%2$d, c=%d", 11, 12, 13);
        System.out.println(s); //NUMBER by order = $
        
    }
}

/*
%s

	String

%d

	целое число: byte, short, int, long

%f

	вещественное число: float, double

%b

	boolean

%c

	char

%t

	Date

%%

	Символ %
 */

/*

    H, M, S characters are responsible for extracting the hours, minutes and seconds from the input Date.
    L, N represent the time in milliseconds and nanoseconds accordingly.
    p adds a.m./p.m. formatting.
    z prints out the time-zone offset.

 */

//https://www.baeldung.com/java-printstream-printf