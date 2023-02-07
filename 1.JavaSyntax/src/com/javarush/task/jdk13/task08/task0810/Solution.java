package com.javarush.task.jdk13.task08.task0810;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Измерить сколько времени занимает 10 тысяч вызовов get для каждого списка
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getGetTimeInMs(fill(new ArrayList<>())));
        System.out.println(getGetTimeInMs(fill(new LinkedList<>())));
    }

    public static List<Object> fill(List<Object> list) {
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static long getGetTimeInMs(List<Object> list) {
        Instant now = Instant.now();

        get10000(list);

        Instant after = Instant.now();

        return Duration.between(now, after).toMillis();
    }

    public static void get10000(List<Object> list) {
        if (list.isEmpty()) {
            return;
        }
        int x = list.size() / 2;

        for (int i = 0; i < 10000; i++) {
            list.get(x);
        }
    }
}

//1, 138 - АЛ в разы быстрее (при добавлении в конец)
//опять же, решить можно через дейт:
//Date date = new Date();
//...
//Date date2 = new Date();
//return date2.getTime() - date.getTime();

//и по той же логике: System.currentTimeMillis()