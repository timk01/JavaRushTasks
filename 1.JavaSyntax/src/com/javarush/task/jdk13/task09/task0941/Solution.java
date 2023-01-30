package com.javarush.task.jdk13.task09.task0941;

import java.util.Arrays;
import java.util.StringTokenizer;

/* 
IPv6
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(map(""/*"2001:db8:11a3:9d7:1f34:8a2e:7a0:765d"*/)));
    }

    public static String[] map(String ipv6) {
        StringTokenizer stringTokenizer = new StringTokenizer(ipv6, ":");
        int length = stringTokenizer.countTokens();
        String[] arr = new String[length];
        for (int j = 0; j < length; j++) { // or stringTokenizer.hasMoreTokens()
            arr[j] = stringTokenizer.nextToken();
        }
        return arr;
    }
}

//так конечно эффективней.... (если мы знаем что токен есть)
//нексттокен вернет... ВСЮ строку. а сплит разобьет ее на массив.
/*
            StringTokenizer token = new StringTokenizer(ipv6);
        if (token.hasMoreTokens()) {
            return token.nextToken().split(":");
        }
        return new String[0];*/
