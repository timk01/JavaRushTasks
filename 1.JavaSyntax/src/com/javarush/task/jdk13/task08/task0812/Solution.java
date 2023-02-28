package com.javarush.task.jdk13.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/

public class Solution {
    public static final int TEN = 10;

    public static void main(String[] args) throws IOException {
        List<Integer> integerList = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < TEN; i++) {
            integerList.add(Integer.parseInt(bufferedReader.readLine()));
        }
        int repeatCounterOld = 1;
        int repeatCounterNew = 1;
        for (int i = 1; i < integerList.size(); i++) {
            Integer anotherInteger = integerList.get(i);
            if (anotherInteger.compareTo(integerList.get(i - 1)) == 0) {
                repeatCounterNew++;
                if (repeatCounterNew > repeatCounterOld) {
                    repeatCounterOld++;
                }
            } else {
                repeatCounterNew = 1;
            }
        }
        System.out.println(repeatCounterOld);
        //2, 4, 4, 4, 8, 8, 4, 12, 12, 14
    }
}

/*
логика. бежим по циклу. прежде всего, сравниваем 2 числа - предыдущее и последующее.
не равны ? каунтер = 1.
равны ? увеличь каунтер на 1 (есть же совпадение!)
и сравни его со старым каунтером (старый каунтер = максимальное количество повторений)
... продолжай цикл (если числа будут повтоярться, новый каунтер, а затем и старый будут увеличиваться на 1)
НО. как только исла не будут равны, новый каунтер обнулится, а старый останется прежним.
т.е. новый каунтер будет больше старого только тогда, когда повторов у нового числа будет больше чем у старого "рекордсмена"
(например был рекорд 3 числа, старый каунтер "прирастет") только в том случае если мы увидим 4 и более числе подряд)
 */

//вариант верного решения.
/*
int count = 1;
        int max = 1;
        for (int i = 0; i < 9; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                max++;
            } else if (max > count) {
                count = max;
                max = 1;
            } else {
                max = 1;
            }
        }

        if (max > count) {
            count = max;
        }

        System.out.println(count);
 */

//test data
//List<Integer> integerList = new ArrayList<Integer>(List.of(2, 4, 4, 4, 8, 8, 4, 12, 12, 14));

//чтобы просто посчитать все повторяющиеся (но подряд, если сорт... или без сорта просто количетсво одинаковых цифр в колл.)
//integerList.sort(Comparator.naturalOrder());
//        Map<Integer, Long> collect = integerList.stream().collect(Collectors.groupingBy(integerList::get/*, Collectors.counting()*/));
/*        Map<Integer, Long> collect = integerList.stream().collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));
        collect.forEach((k, v) -> System.out.println(v));*/