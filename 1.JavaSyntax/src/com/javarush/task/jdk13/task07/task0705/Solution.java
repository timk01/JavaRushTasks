package com.javarush.task.jdk13.task07.task0705;

/*
Один большой массив и два маленьких
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] bigIntArr = new int[20];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < bigIntArr.length; i++) {
            bigIntArr[i] = Integer.parseInt(bufferedReader.readLine());
        }
        for (int i = 0; i < bigIntArr.length; i++) {
            bigIntArr[i] = i;
        }
        int[] smallArrFirst = new int[10];
        int[] smallArrSecond = new int[10];
        smallArrFirst = Arrays.copyOfRange(bigIntArr, 0, bigIntArr.length / 2);
        smallArrSecond = Arrays.copyOfRange(bigIntArr, bigIntArr.length / 2, bigIntArr.length);
        for (int i : smallArrSecond) {
            System.out.println(i);
        }

        //тема. лучшее решение, пожалуй
        /*smallArrFirst = Arrays.stream(bigIntArr).limit(10).toArray();
        smallArrSecond = Arrays.stream(bigIntArr).skip(10).toArray();
        for (int i : smallArrFirst) {
            System.out.println(i);
        }
        System.out.println();
        for (int i : smallArrSecond) {
            System.out.println(i);
        }*/

        //variant 2
        /*        System.arraycopy(bigIntArr, 0, smallArrFirst, 0, 10);
        System.arraycopy(bigIntArr, 10, smallArrSecond, 0, 10);*/
        //variant 3 - clone (shallow copy), 4 - external, like apache commons
    }
}
