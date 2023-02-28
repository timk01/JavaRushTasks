package com.javarush.task.jdk13.task08.task0814;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {

    public static Set<Integer> createSet() {
        Set<Integer> integerSet = new HashSet<>();
        Collections.addAll(integerSet, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 200, -50, 30, 25, 0, 100);
        return integerSet;
    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
        set.removeIf(x -> x > 10);
    }

    public static void main(String[] args) {
/*        Set<Integer> set = createSet();
        set.forEach(System.out::println);
        System.out.println();
        removeAllNumbersGreaterThan10(set);
        set.forEach(System.out::println);*/
    }
}

//Set.of(...)
//Collections.addAll(integerSet, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 200, -50, 30, 25, 0, 100);
//анмодифайбл ТОЛЬКО of
//сама .addAll() модифайбл
//https://docs.oracle.com/en/java/javase/11/core/creating-immutable-lists-sets-and-maps.html#GUID-4F3E2B7D-CE90-4862-A78A-414FC08DA6E4

/*
Разобрался. Про сабж, не модифицируют стримы "оригинальную" коллекцию.
Т.е. несмотря на то, что мы передаем копию значения ссылки (и вроде бы все изменения копии должны на ней отражаться,
как при нормальных не-примитивах), стрим не модифицирует коллекцию (а именно это и вводило меня в ступор):
даже если мы делаем
set = ...
мы присваиваем копии новую коллекцию ((потому и Returns a Collector that accumulates the input elements into a new Set))

https://stackoverflow.com/questions/34667561/will-java-8-create-a-new-list-after-using-stream-filter-and-collect
 */
//https://javarush.com/help/88255

/*
    Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
                if (iterator.next() > 10) {
                iterator.remove();
                }
                }*/

//оригинальное решение: бежим по копии, но удаляем из оригинала (иначе конааррент)
/*
Set<Integer> copy = new HashSet<>(set);
        for (Integer number : copy) {
            if (number > 10) {
                set.remove(number);
            }
        }
 */