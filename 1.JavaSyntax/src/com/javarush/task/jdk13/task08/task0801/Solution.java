package com.javarush.task.jdk13.task08.task0801;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* 
Set из растений
*/

public class Solution {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        Collections.addAll(set,
                "арбуз",
                "банан",
                "вишня",
                "груша",
                "дыня",
                "ежевика",
                "женьшень",
                "земляника",
                "ирис",
                "картофель"
        );
        set.forEach(System.out::println);
    }
}

//ИНТЕРЕСНО, что эддОлл - при нем НЕ меняется порядок добавленных элементов (внезапно)
//set.add("арбуз");

//Set<String> set2 = Set.<String>of("val1", "val2", "val3"); наподобие Лист.оф - анмодифайбл

/*String plants = "арбуз\n" +
        "банан\n" +
        "вишня\n" +
        "груша\n" +
        "дыня\n" +
        "ежевика\n" +
        "женьшень\n" +
        "земляника\n" +
        "ирис\n" +
        "картофель";
String[] arrayOfPlants = plants.split("\\n");
for (int i = 0; i < 10; i++) {
    hashSetOfPlants.add(arrayOfPlants[i]);
}
*/
