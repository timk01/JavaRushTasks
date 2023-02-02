package com.javarush.task.jdk13.task07.task0707;

import java.util.ArrayList;
import java.util.Arrays;

/* 
5 различных строк в списке
*/

public class Solution {

    public static ArrayList<String> list;

    public static void main(String[] args) {
        list = new ArrayList<>();
        list.addAll(Arrays.asList("1", "2", "3", "4", "5"));
        System.out.println(list.size());
        list.stream().forEach(System.out::println);
    }
}

//alternatively:
//Collections.addAll(list, "123", "123"); //after list creation
////= List.of("1", "2", "3");
//or just add (in loop)

/*
        /*for (String s : list) {
            System.out.println(s);
        }
        */

