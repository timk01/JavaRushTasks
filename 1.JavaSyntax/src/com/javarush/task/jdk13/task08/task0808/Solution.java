package com.javarush.task.jdk13.task08.task0808;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
10 тысяч удалений и вставок
*/

public class Solution {
    public static final int TEN_THOUSAND = 10_000;

    public static void main(String[] args) {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        // LinkedList
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
    }

    public static void insert10000(List list) {
        for (int i = 0; i < TEN_THOUSAND; i++) {
            list.add(new Object());
        }

    }

    public static void get10000(List list) {
        for (int i = 0; i < TEN_THOUSAND; i++) {
            list.get(i);
        }

    }

    public static void set10000(List list) {
        for (int i = 0; i < TEN_THOUSAND; i++) {
            list.set(0, new Object());
        }
    }

    public static void remove10000(List list) {
        if (list.isEmpty()) {
            return;
        }
        for (int i = 0; i < TEN_THOUSAND; i++) {
            list.remove(0);
        }
        //изЕмпти на всякий случай
        //здесь если будет удаление из середины, он на ней и запнется на 5к (по позиции, т.к. размер листа уменьшается)

    }
}
