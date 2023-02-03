package com.javarush.task.jdk13.task07.task0716;

import java.util.ArrayList;
import java.util.ListIterator;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        ListIterator<String> iterator = strings.listIterator();
        String charR = "р";
        String charL = "л";
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.contains(charR) && next.contains(charL)) {
            } else if (next.contains(charL)) {
                iterator.add(next);
            } else if (next.contains(charR)) {
                iterator.remove();
            }
        }
        return strings;
    }
}

//boolean b = strings.removeIf(string -> string.contains("р")) //не нужен

//верное решение
/*
        String r = "р";
        String l = "л";

        ArrayList<String> result = new ArrayList<>();
        for (String string : strings) { //бежим по эррею
            boolean isR = string.contains(r);
            boolean isL = string.contains(l);

            if (isR && !isL) { //если только Р (но не Л) - ничего делать не надо, пропускаем ход
                continue;
            }

            if (!isR && isL) {
                result.add(string);
                //удваивает если только Л (но не Р)
            }

            result.add(string);
            //если ни Р, ни Л не найдено, "ничего не делать со словами" = добавить слово
            //(если перед этим было Л, НО не Р - два раза. здесь и выше
        }
        return result;
 */

//немного более понятное голове верное решение
/*
        String r = "р";
        String l = "л";

        ArrayList<String> result = new ArrayList<>();
        for (String string : strings) { //бежим по эррею
            boolean isR = string.contains(r);
            boolean isL = string.contains(l);

            if (isR && isL) { //добавляем = оставить слово без изменений. скипаем остальное
                result.add(string);
                continue;
            }

            if (isR) { //удаляем = просто скипаем
                continue;
            }

            if (isL) { //добавляем раз
                result.add(string);
            }
            result.add(string); //добавляем 2 при Л (т.е. добавит он здесь 2 раза только при Л)
            //а один раз - когда ничего не подошло (равносильно "нчиего не делать")
        }
        return result;
 */