package com.javarush.task.jdk13.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.stream.Collectors;

/* 
Нужно заменить функциональность программы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<String>();
        while (true) {
            String string = reader.readLine();
            if (string == null || string.isEmpty()) break;
            strings.add(string);
        }

        ArrayList<String> resultStrings = new ArrayList<String>();
        resultStrings = strings.stream().map(x -> x.length() % 2 == 0 ? String.join(" ", x, x) : String.join(" ", x, x, x)).collect(Collectors.toCollection(() -> new ArrayList<>()));

        for (String resultString : resultStrings) {
            System.out.println(resultString);
        }
    }
}

//крутая штука, кстати!
//String.join(" ", x, x)

//ну или так.
/*
        ArrayList<String> resultStrings = new ArrayList<String>();
        String changedString;
        for (String string : strings) {
            changedString = string.length() % 2 == 0 ? string + " " + string : string + " " + string + " " + string;
            resultStrings.add(changedString);
        }
 */