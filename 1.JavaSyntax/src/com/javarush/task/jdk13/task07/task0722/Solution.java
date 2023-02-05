package com.javarush.task.jdk13.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static final String KEY_WORD = "end";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();
        boolean stopTime = true;
        while (stopTime) {
            String s = reader.readLine();
            if (KEY_WORD.equals(s)) {
                stopTime = false;
            } else {
                arrayList.add(s);
            }
        }
        arrayList.forEach(System.out::println);
    }
}

/*while (true) {
            String string = reader.readLine();
            if (string.equals("end")) {
                break;
            }
            strings.add(string);
        }

 */