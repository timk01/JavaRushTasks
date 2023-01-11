package com.javarush.task.pro.task05.task0521;

/* 
Выполнение фрагмента кода
*/

public class Solution {

    public static int result = 45967;

    public static void main(String[] args) {
        String loop = "    for (double fahrenheit = -459.67; fahrenheit < 451; fahrenheit += 40) {\n";
        System.out.println(loop);
    }
}
//loop.replaceAll("\\W", "").split("fahrenheit")[1]
// \w, \W: ANY ONE word/non-word character. For ASCII, word characters are [a-zA-Z0-9_]
// т.е. fordoublefahrenheit45967fahrenheit451fahrenheit40 ((выкинет пробелы, знаки, точки, спецзнаки)) - останутся только слова и цифры
// loop.replaceAll("\\w", "") -->      (  = -.;  < ;  += ) { ((все цифры, буквы))
//"fordoublefahrenheit45967fahrenheit451fahrenheit40".split("fahrenheit") разсплитит на массив ["fordouble", "45967", "451", "40"]
//[] возьмет его 2 элемент (по индексу 1)