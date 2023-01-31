package com.javarush.task.pro.task11.addons;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTraverseAndRemove {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 0, -5, -7, -12, 5, 15);

        //ConcurrentModificationException! нельзя идти и изменять
/*        for (Integer value : list) { 
            if (value < 0)
                list.remove(value);
        }*/

        //1 вариант с Копией массива 
        ArrayList<Integer> copy = new ArrayList<Integer>(list);
        for (Integer value : copy) {
            if (value < 0) {
                list.remove(value);
            }
        }

        //2, который как раз и предлагает компилятор
        /*
        Removes all of the elements of this collection that satisfy the given predicate.
        Errors or runtime exceptions thrown during iteration or by the predicate are relayed to the caller.
         */
        /*
        Predicate – это функциональный интерфейс. (ТРУ/ФОЛС)
        Это означает, что мы можем передавать лямбда-выражения везде, где ожидается предикат.
         */
        //см. примеры с работниками в калссах

        list.removeIf(value -> value < 0);
    }


}
