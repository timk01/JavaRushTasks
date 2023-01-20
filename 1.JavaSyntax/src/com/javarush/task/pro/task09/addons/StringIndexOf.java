package com.javarush.task.pro.task09.addons;

import java.util.Scanner;

public class StringIndexOf {
    public static void main(String[] args) {
        /*
        Методы indexOf(String) и indexOf(String, index) часто используются в паре.
        Первый позволяет найти первое вхождение переданной подстроки в текущей строке.
        А второй метод позволяет найти второе, третье и т.д. вхождения за счет того,
        что пропускает первые index символов.

        Допустим, у нас есть url типа такого: «https://domen.ru/about/reviews»,
        и мы хотим заменить имя домена на javarush.ru.
        Домены в урлах могут быть разными, но мы знаем, что:

        Перед именем домена идут два слеша «//»
        После имени домена идет одинарный слеш /
         */

        Scanner console = new Scanner(System.in);
        String path = console.nextLine();

        int index = path.indexOf("//"); // Получаем индекс первого вхождения строки // это будет 6
        int index2 = path.indexOf("/", index + 2); //17
        //Получаем индекс первого вхождения строки /, но ищем только после символов //. (т.к. мы знаем, что // = 2, ищем ПОСЛЕ

        String first = path.substring(0, index + 2); //Получаем строку от начала и заканчивая символами //
        String last = path.substring(index2);

        String result = first + "javarush.ru" + last;
        System.out.println(result);

        /*
        Методы lastIndexOf(String) и lastIndexOf(String, index) работают точно так же,
        только поиск ведется с конца строки к началу.
         */
    }
}

/*
int indexOf(String str)

	Ищет строку str в текущей строке. Возвращает индекс первого символа встретившейся строки.

int indexOf(String str, int index)

	Ищет строку str в текущей строке, пропустив index первых символов. Возвращает индекс найденного вхождения.

int lastIndexOf(String str)

	Ищет строку str в текущей строке с конца. Возвращает индекс первого вхождения.

int lastIndexOf(String str, int index)

	Ищет строку str в текущей строке с конца, пропустив index первых символов.

boolean matches(String regex)

	Проверяет, что текущая строка совпадает с шаблоном, заданным регулярным выражением.
 */