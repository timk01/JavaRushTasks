package com.javarush.task.jdk13.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static int n;
    public static int m;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(reader.readLine());
        m = Integer.parseInt(reader.readLine());
        ArrayList<String> stringList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            stringList.add(reader.readLine());
        }

        while (m > 0) {
            stringList.add(stringList.size() - 1, stringList.remove(0));
            m--;
        }
        stringList.forEach(System.out::println);
    }
}

//равносильно
////strings.add(strings.remove(0))


//рабочий, кстати, план. Но с выделением списка...
/*
        List<String> stringListToAddFirst = stringList.subList(m, n);
        List<String> stringListToAddSecond = stringList.subList(0, m);
        List<String> finalList = new ArrayList<>(stringListToAddFirst);
        finalList.addAll(stringListToAddSecond);
        System.out.println("finalList" + finalList);
 */

//а вот это будет выдавать... конкаррент ошибку
/*    List<String> strings = stringList.subList(m, n);
        System.out.println(strings);
                List<String> strings2 = stringList.subList(0, m);
        System.out.println(strings2);
        stringList.clear();
        stringList.addAll(strings);
        stringList.addAll(strings2);*/
