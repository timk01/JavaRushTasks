package com.javarush.task.jdk13.task07.array_list_generics.generics.arraylistandgeneric;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArratToListAndViceVersa {
    public static void main(String[] args) {
        Cat thomas = new Cat("Томас");
        Cat behemoth = new Cat("Бегемот");
        Cat philipp = new Cat("Филипп Маркович");
        Cat pushok = new Cat("Пушок");

        Cat[] catsArray = {thomas, behemoth, philipp, pushok};
        String abc = "ABC";
        abc.le
        ArrayList<Cat> catsList = new ArrayList<>(Arrays.asList(catsArray));
        catsArray = catsList.toArray(new Cat[0]); //best case to put Empty array!


    }
}
