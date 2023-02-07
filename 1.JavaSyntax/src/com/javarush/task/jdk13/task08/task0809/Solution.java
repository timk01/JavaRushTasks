package com.javarush.task.jdk13.task08.task0809;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Измерить сколько времени занимает 10 тысяч вставок для каждого списка
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {
        Instant before = Instant.now();
        insert10000(list);
        Instant after = Instant.now();
        return Duration.between(before, after).toMillis(); //именно бефор, афтер
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}

//как вариант
//https://javarush.com/quests/lectures/questsyntax.level08.lecture04
//https://javarush.com/quests/lectures/questsyntaxpro.level16.lecture01
/*
        Date start = new Date();
        insert10000(list);
        Date end = new Date();
        return end.getTime() - start.getTime();
 */

/*        long timeBefore = System.currentTimeMillis();

        insert10000(list);

        long timeAfter = System.currentTimeMillis();

        return timeAfter - timeBefore;*/

//11, 6; 7, 3; 10, 5