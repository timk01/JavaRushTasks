package com.javarush.task.pro.task09.addons;

import java.util.Scanner;

public class StringGeneral {
    public static void main(String[] args) {
        //1 Unix в качестве разделителя директорий использует символ /, Windows — символ \
        //cat /home/kt/abc.sql
        Scanner console = new Scanner(System.in);
        String path = console.nextLine();

        char[] chars = path.toCharArray();
        for (int i = 0; i < chars.length; i++)
            if (chars[i] == '/')
                chars[i] = '\\';

        String result = new String(chars);
        System.out.println(result);

        //2 split() и join()
        path = console.nextLine();
        String[] array = path.split("/");
        result = String.join("\\", array);
        //Returns a new String composed of copies of the CharSequence elements joined together with a copy of the specified delimiter.
        System.out.println(result);

        //3 replace()
        path = console.nextLine();
        result = path.replace('/', '\\');
        System.out.println(result);

        //сравнивет ЧАСТИ строк
        // boolean regionMatches(int toffset, String str, int offset, int len)
        /*
        boolean equals(String str)
        boolean equalsIgnoreCase(String str)
        int compareTo(String str)
        int compareToIgnoreCase(String str)
        boolean startsWith(String prefix)
        boolean endsWith(String suffix)
         */

        //4 которая просит пользователя ввести путь к файлу и проверяет, что это за файл по его расширению
        path = console.nextLine();
        if (path.endsWith(".jpg") || path.endsWith(".jpeg")) {
            System.out.println("Это Jpeg!");
        } else if (path.endsWith(".htm") || path.endsWith(".html")) {
            System.out.println("Это HTML-страница");
        } else if (path.endsWith(".doc") || path.endsWith(".docx")) {
            System.out.println("Это документ Word");
        } else {
            System.out.println("Неизвестный формат");
        }

    }
}

/*
int length()

	Возвращает количество символов в строке

boolean isEmpty()

	Проверяет, что строка == пустая строка

boolean isBlank()

	Проверяет, что в строке — только whitespace-символы: пробел, tab, enter и т.п.

char charAt(int index)

	Возвращает символ, который стоит на index-позиции в строке.

char[] toCharArray()

	Возвращает массив символов (копию), из которых состоит строка

byte[] getBytes()

	Преобразует строку в набор байт и возвращает массив байт.

String[] split(String regex)

	Разделяет строку на несколько подстрок.

String join(CharSequence delimiter, elements)

	Склеивает вместе несколько подстрок

String intern()

	Помещает строку в пул StringPool.
 */

