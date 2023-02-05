package com.javarush.task.jdk13.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
        int length = array.length;
        for (int i = 0; i < length / 2; i++) { //works for odd AND even.
            int temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
        }
    }
}

//better classic one
/*
        boolean continueSwap = false;
        while (!continueSwap) {
            continueSwap = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] < array[i]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;

                    continueSwap = false;
                }
            }
        }
 */

//classic one
/*
for (int i = 0; i < array.length - 1; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
 */


//можно, конечно, и так Collections.sort(list, Collections.reverseOrder()); //НЕ работает с массивом интов (только Интежер)
/*
ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        Collections.sort(list, Collections.reverseOrder());
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
 */