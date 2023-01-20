package com.javarush.task.pro.task09.addons;

public class StringSubsting {
    public static void main(String[] args) {
        "Привет".substring(0, 3); //"При"
        "Привет".substring(1, 6); //"ривет"
        "Привет".substring(1); //"ривет"

        "Привет".repeat(3); //"ПриветПриветПривет"
        "Привет".repeat(0); //""

        "Привет".replace('Я', 'я'); //"Привет"
        "Привет".replace('и', 'ы'); //"Прывет"
        
        /*
        Метод replaceAll() заменяет все вхождения одной подстроки на другую.
        Метод replaceFirst() заменяет первое вхождение переданной подстроки на заданную подстроку. 
        Строка, которую заменяют, задается регулярным выражением. 
         */

        //для начала...
        "Good news everyone!".replaceAll("o", "-o-"); //Вывод: "G-o--o-d news every-o-ne!"
        //Соответственно, если убрать точки после "o" совсем, то "o" заменится на 3 символа "-o-":

        "Good news everyone!".replaceAll("e.", "EX");
        //. = mtches ANY character - ЛЮБОЙ СИМВОЛ после Е меняется на Х (тут замена логична)
        //"Good nEXs EXEXyonEX"

        //тут сложней...
        "Good news everyone!".replaceAll("o.", "-o-"); //Вывод: "G-o-d news every-o-e!"
        /*
        точка после "o" означает, количество символов после "o" (тут ЛЮБОЙ ОДИН СИМВОЛ),
        которые будут перекрываться заменяемыми символами.
        Т.е. выражение "o." означает, что вместо "o" будет "-o",
        а следующий за "o" символ будет заменен на "-".
         */

        //Таким образом, если в рассматриваемом выражении добавить после "o" еще одну точку "o..",
        // то вывод на экран будет другим: 
        // (грубо, он заменит 3 символа из которых 2 последние ЛЮБЫЕ и первый - о)
        //на -o-

        "Good news everyone!".replaceAll("o..", "-o-"); //Вывод: "G-o- news every-o-!"

        //а тут - только первые
        "Good news everyone!".replaceFirst("e.", "EX"); //"Good nEXs everyone!"

        "Good news everyone!".replaceFirst("o.", "-o-");//"G-o-d news everyone!"

    }
}

/*
String substring(int beginIndex, int endIndex)

	Возвращает подстроку, заданную интервалом символов beginIndex..endIndex.

String repeat(int count)

	Повторяет текущую строку count раз

String replace(char oldChar, char newChar)

	Возвращает новую строку: заменяет символ oldChar на символ newChar

String replaceFirst(String regex, String replacement)

	Заменяет в текущей строке подстроку, заданную регулярным выражением.

String replaceAll(String regex, String replacement)

	Заменяет в текущей строке все подстроки, совпадающие с регулярным выражением.

String toLowerCase()

	Преобразует строку к нижнему регистру

String toUpperCase()

	Преобразует строку к верхнему регистру

String trim()

	Удаляет все пробелы в начале и конце строки
 */

/*
https://javarush.com/quests/lectures/questsyntaxpro.level09.lecture04.story
 */
