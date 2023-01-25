package com.javarush.task.jdk13.task09.task0934;

/* 
Палиндром слова
*/

public class Solution {
    public static void main(String[] args) {
        String word = "Кот";
        String answer = isPalindrome(word) ? "Да" : "Нет";
        System.out.println("Слово \"" + word + "\" палиндром? " + answer);
    }

    public static boolean isPalindrome(String word) {
        StringBuilder sb = new StringBuilder(word.toLowerCase());
        sb.reverse();
        return sb.compareTo(new StringBuilder(word.toLowerCase())) == 0;
    }
}

////word.equals(sb.toString());
//word.equalsIgnoreCase(sb.toString();