package com.javarush.task.jdk13.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Налоговая и зарплаты
*/

public class Solution {
    public static final int TEN = 10;
    public static final int HUNDRED = 100;
    public static final int WAGE_THRESHHOLD = 500;

    public static Map<String, Integer> createMap() {
        Map<String, Integer> wageMap = new HashMap<>();
        for (int i = 1; i <= TEN; i++) {
            wageMap.put("wokrer" + i, i * HUNDRED);
        }
        return wageMap;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //кстати ДА! можно же с помощью ремувИф удалять:
        map.entrySet().removeIf(e -> e.getValue() < WAGE_THRESHHOLD);
    }

    public static void main(String[] args) {
        Map<String, Integer> map = createMap();
        removeItemFromMap(map);
/*
        map.forEach((k, v) -> System.out.println(k + " - " + v));
*/
    }
}

//оиригинальное принятое решение ерез классический итератор
/*        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Integer wage = iterator.next().getValue();
            if (wage.compareTo(WAGE_THRESHHOLD) < 0) {
                iterator.remove();
            }
        }*/