package com.javarush.task.jdk13.task07.array_list_generics.generics;

import java.util.ArrayList;
import java.util.List;

public class GarbageTesting {
    public static void main(String[] args) {
        List<?> smth = new ArrayList<Paper>(); //any type, including Paper
        List<? extends Garbage> example2 = new ArrayList<Paper>(); //Garbage and Below
        List<? super Garbage> example3 = new ArrayList<Garbage>(); //Garbage and Upper (Object)
        List<Box> boxList; //Raw use of parameterized class 'Box'
        List<Box<Paper, Plastic>> goodBox;
    }
}
