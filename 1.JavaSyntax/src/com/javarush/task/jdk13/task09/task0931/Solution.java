package com.javarush.task.jdk13.task09.task0931;

/* 
Удаление пробелов
*/

public class Solution {
    public static void main(String[] args) {
        String stringWithoutSpaces = deleteSpaces("Добрый день! Как дела?");
        System.out.println(stringWithoutSpaces);
    }

    public static String deleteSpaces(String string) {
        //String[] split = string.split("\\s");
        //Arrays.stream(split).forEach(System.out::println);
        return String.join("", string.split("\\s")); //Collectors.joining()
        //return Stream.of(string.split("\\s")).collect(Collectors.joining(""));
    }
}

//блин, гораздо проще...
//return string.replace(" ", "");
//или
//return string.replaceAll(" ", "");