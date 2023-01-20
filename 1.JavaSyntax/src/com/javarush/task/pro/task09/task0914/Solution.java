package com.javarush.task.pro.task09.task0914;

/* 
Обновление пути
*/

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        StringBuilder sb = new StringBuilder(path);
        int start = path.indexOf("jdk");
        return sb.replace(start, path.indexOf("/", start), jdk).toString();
    }
}

//оригинальное решение
        /*int firstIndex = path.indexOf("jdk");
        int lastIndex = path.indexOf("/", firstIndex);
        //индекс первого вхождения /, но ПОСЛЕ первой найденной jdk (т.е. первый после ЖДК)
        String smth = path.substring(firstIndex, lastIndex); //вырезаем строку jdk1.8
        return path.replace(smth, jdk); //эту строку целиком меняем на нужную*/

//тоже вполне себе работает "склейка"
/*
int firstIndex = path.indexOf("jdk")
String start = path.substring(0, firstIndex);
int lastIndex = path.indexOf("/", firstIndex);
                String end = path.substring(lastIndex);
                String newString = start + jdk + end;

                return newString;*/

/*
Returns the index _within_ this string of the first occurrence of the specified substring, _starting at the specified index_.
 */
