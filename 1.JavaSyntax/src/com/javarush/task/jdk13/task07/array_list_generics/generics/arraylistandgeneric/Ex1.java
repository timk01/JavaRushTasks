package com.javarush.task.jdk13.task07.array_list_generics.generics.arraylistandgeneric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ex1 { //read number and add till empty string + add to end or beginning if res is odd/even
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            int x = Integer.parseInt(s);
            if (x % 2 == 0)  //проверяем, что остаток от деления на два равен нулю
                list.add(x);          //добавление в конец
            else
                list.add(0, x);      //вставка в начало
        }
    }
}
