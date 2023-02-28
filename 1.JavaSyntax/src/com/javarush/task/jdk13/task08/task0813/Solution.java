package com.javarush.task.jdk13.task08.task0813;

import java.util.HashSet;
import java.util.Set;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static final int TWENTY = 20;
    public static final char CYRILLIC_L = 'Л';

    public static Set<String> createSet() {
        Set<String> lSet = new HashSet<>();
        for (int i = 0; i < TWENTY; i++) {
            //lSet.add(CYRILLIC_L + "" + i);
            lSet.add(Character.toString(CYRILLIC_L).repeat(i + 1));
        }
        return lSet;
    }

    public static void main(String[] args) {
        HashSet<String> lSet = (HashSet<String>) createSet();
        lSet.forEach(System.out::println);

    }
}
