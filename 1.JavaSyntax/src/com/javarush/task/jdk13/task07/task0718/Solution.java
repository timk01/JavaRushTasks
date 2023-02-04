package com.javarush.task.jdk13.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Сортировка списка
*/

public class Solution {
    private static final int TEN = 10;

    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < TEN; i++) {
            list.add(reader.readLine());
        }

/*        String currentString = list.get(0);

        for (int i = 1; i < 10; i++) {
            if (list.get(i).length() >= currentString.length()) {
                currentString = list.get(i);
            } else {
                System.out.println(i);
                break;
            }
        }*/
        int indexOfFaultElement = checkIfArrayIsSortedBYLength(list);
        if (indexOfFaultElement != -1) {
            System.out.println(indexOfFaultElement);
        }
    }

    private static int checkIfArrayIsSortedBYLength(ArrayList<String> list) {
        int index = -1;
        for (int i = 0, j = 1; i < list.size() - 1; i++, j++) {
            if (list.get(i).length() > list.get(j).length()) {
                index = j;
                break;
            }
        }
        return index;
    }
}

