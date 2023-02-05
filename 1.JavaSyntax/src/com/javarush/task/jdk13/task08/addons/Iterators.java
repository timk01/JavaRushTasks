package com.javarush.task.jdk13.task08.addons;

import java.util.*;

public class Iterators {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Mama");
        set.add("Mila");
        set.add("Ramu");

        //1 variant
        //получение итератора для множества
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext())        //проверка, есть ли ещё элементы
        {
            //получение текущего элемента и переход на следующий
            String text = iterator.next();

            System.out.println(text);
        }

        //analogue, 2 variant (from 14 to 22 strings)
        for (String text : set) {
            System.out.println(text);
        }

        Map<String, String> map = new HashMap<String, String>();
        map.put("first", "Mama");
        map.put("second", "Mila");
        map.put("third", "Ramu");

        Iterator<Map.Entry<String, String>> iterator2 = map.entrySet().iterator();

        while (iterator2.hasNext()) {
            //получение «пары» элементов
            Map.Entry<String, String> pair = iterator2.next();
            String key = pair.getKey();            //ключ
            String value = pair.getValue();        //значение
            System.out.println(key + ":" + value);
        }

        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();                      //ключ
            String value = pair.getValue();                  //значение
            System.out.println(key + ":" + value);
        }
    }
}
