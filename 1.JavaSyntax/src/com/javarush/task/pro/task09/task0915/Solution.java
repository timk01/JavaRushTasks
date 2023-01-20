package com.javarush.task.pro.task09.task0915;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);
        List<String> tokenArrayList = new ArrayList<>();
        while (stringTokenizer.hasMoreTokens()) {
            tokenArrayList.add(stringTokenizer.nextToken());
        }
        return tokenArrayList.toArray(size -> new String[size]); //toArray = Collection.toArray
        //String[]::new //obj -> tokenArrayList.toArray(new String[0])
        //String[] arr = new String[tokenArrayList.size()];
        //tokenArrayList.toArray(arr);
    }
}

//String[]::new ---- так понятней: size -> new String[size]
//What it does is find a method that takes in an integer (the size) as argument, and returns a String[],
// which is exactly what (one of the overloads of) new String[] does.
//https://stackoverflow.com/questions/23079003/how-to-convert-a-java-8-stream-to-an-array


//родное решение
/*
    StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);
    String[] result = new String[stringTokenizer.countTokens()]; //СРАЗУ считает токены, ага...  внезапно
    int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
                result[i++] = stringTokenizer.nextToken();
                }
                return result;*/
