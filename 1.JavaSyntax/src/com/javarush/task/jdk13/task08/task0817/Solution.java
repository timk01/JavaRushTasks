package com.javarush.task.jdk13.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Удалить людей, имеющих одинаковые имена
*/

public class Solution {
    public static final int TEN = 10;

    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        /*for (int i = 0; i < TEN; i++) {
            map.put("LastName " + i, "FirstName" + i);
        }*/
        map.put("Смирнов", "Сильвестр");
        map.put("Иванов", "Дмитрий");
        map.put("Кузнецов", "Сильвестр");
        map.put("Соколов", "Роман");
        map.put("Попов", "Максим");
        map.put("Лебедев", "Дмитрий");
        map.put("Новиков", "Александр");
        map.put("Козлов", "Михаил");
        map.put("Морозов", "Илья");
        map.put("Петров", "Алексей");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> mapCopy = new HashMap<>(map);
        for (String value : mapCopy.values()) {
            int counter = 0;
            for (String s : map.values()) {
                if (s.equals(value)) {
                    counter++;
                }
            }
            if (counter > 1) {
                removeItemFromMapByValue(map, value);
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        /*        map.forEach((k, v) -> System.out.println(k + " " + v));*/
    }
}

/*
мудрено! логика такая.
идем по копии мапы изначально. значений.
внутри этого цикла запускаем еще 1. - чтобы сравнивать значения в копии мапы и в оригинальной мапе.
если значения в копии и оригинале совпали более 1 раза, хначит есть 2 и более повтора имен (запоминаем каунтер).
значит всех нужно удалить. из оригинала.
вывалились из цикла, вызвали служебный метод.
метод в самом начале создает копию мапы, переданной ему (она постепенно будет уменьшаться)
идет по этой копии мапы и сравнивает внутри - если воспадает значение - удалит из ОРИГИНАЛЬНОЙ мапы по ключу.
(идем по-прежнему по копии). метод внутри удалит все повторы по велью.

вывалились из метода, в копии смотрим следующее значение (часть копий по вэлью из оригинальной уже удалилось, потому
когда завалимся во внутренний цикл, их там уже не будет, т.е. канутер будет 0)
 */

/*как вариант, вместо 34 строчки:
создть стринглист на основе значений мапы (мапа же меняется!)
посмотреть сколько встречается вэлью
если встречается больше раза, значит удалить все совпадения
 */

/*
            List<String> aStringList = new ArrayList<>(map.values());
            int counter2 = Collections.frequency(aStringList, value);
            if (counter2 > 1) {
                removeItemFromMapByValue(map, value);
            }
 */