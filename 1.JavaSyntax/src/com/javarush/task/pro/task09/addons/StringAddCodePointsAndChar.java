package com.javarush.task.pro.task09.addons;

public class StringAddCodePointsAndChar {
    public static void main(String[] args) {
        String line = "aaabccdddc";
        System.out.println(line.chars().distinct().count()); //4


        String emojiString = "Вставте сюда эмоджи через \uD83D\uDC7B";
        //На один emojiString приходится 2 чара (т.к. не влезает в 16 бит)
        System.out.println(emojiString.codePoints().count()); //1
        System.out.println(emojiString.chars().count()); //2
        //27 и 28: 1 codePoint идёт за 2 char’а

        String a = "\uD83D\uDC7B";
    }
}
