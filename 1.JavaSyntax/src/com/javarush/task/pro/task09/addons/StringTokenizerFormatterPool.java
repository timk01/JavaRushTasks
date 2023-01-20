package com.javarush.task.pro.task09.addons;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerFormatterPool {
    public static void main(String[] args) {
        String str = "Good news everyone!";
        String[] strings = str.split("ne"); //sometimes need a complex regex.. soooo
        System.out.println(Arrays.toString(strings)); //["Good ", "ws everyo", "!"]

        //sooo, tokenizer
        //Этот класс не использует регулярные выражения:
        // вместо этого в него просто передается строка, состоящая из символов-разделителей
        
/*        String nextToken() - Возвращает следующую подстроку (типа некстлайна)
        boolean hasMoreTokens() - Проверяет, есть ли еще подстроки. (хэзнекстлайна)*/

        //StringTokenizer имя = new StringTokenizer(строка, разделители);
        //разделители — это строка, _каждый_ символ которой считается символом-разделителем

        str = "Good news everyone!";
        StringTokenizer tokenizer = new StringTokenizer(str, "ne");
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }

        //крч, КАЖДЫЙ символ строки. т.е. И n, И е (сравни с верхним примером)

/*
        Good
                ws
        v
                ryo
        !
*/

    }
}
