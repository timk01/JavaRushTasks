package com.javarush.task.pro.task09.addons;

public class StringLiteralShield {
    public static void main(String[] args) {
        String s = "Фильм \"Друзья\" номинирован на \"Оскар\""; //with \
        String charLiteral = "\""; //OK
        char ch = '"'; //OK - \" = ONE symbol
        System.out.println("0\t1\t2\t3"); //just a tab
        System.out.println("0\t10\t20\t30");
        System.out.println("0\t100\t200\t300");
        System.out.println("Привет\b\b Мир");
        System.out.println("Привет\rМир!"); //МИР.
        /*
        Этот символ переносит курсор в начало текущей строки, не меняя текста. Следующий выводимый текст будет перетирать существующий.
         */
        System.out.println("c:\\projects\\my\\first"); //right
        //System.out.println("c:\projects\my\first"); //wrong

        System.out.printf("Процент жирности молока : %d%%", 10); //it;s like %d - decimal + one % for printing % and one % for escaping it

        System.out.println("\u00A9 JavaRush");

        System.out.println("\uD83D\uDD0A"); //🔊 = это ДВА символа, но отображаются как один
    }
}

/*
\t 	Вставить символ табуляции
\b 	Вставить символ возврата на один символ
\n 	Вставить символ новой строки
\r 	Вставить символ возврата каретки
\f 	Вставить символ прогона страницы (аналог разрыва страницы)
\' 	Вставить одинарную кавычку
\" 	Вставить двойную кавычку
\\ 	Вставить обратный слеш
 */