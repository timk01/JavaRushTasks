package com.javarush.task.jdk13.task08.task0803;

import java.util.HashMap;
import java.util.Map;

/* 
Коллекция Map из котов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] catsArray = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

        Map<String, Cat> map = addCatsToMap(catsArray);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static Map<String, Cat> addCatsToMap(String[] cats) {
        Map<String, Cat> catMap = new HashMap<>();
        for (String cat : cats) {
            catMap.put(cat, new Cat(cat));
        }
        return catMap;
    }


    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}

//Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
//ключ типа Стринг хранится в массиве, а далее идет сам кот с полем типа нейм. бредоватое услвоие.