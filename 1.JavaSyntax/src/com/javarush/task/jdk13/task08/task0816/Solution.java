package com.javarush.task.jdk13.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* 
Удалить всех людей, родившихся летом
*/

public class Solution {


    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне0", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне1", dateFormat.parse("JANUARY 1 2012"));
        map.put("Сталлоне2", dateFormat.parse("FEBRUARY 1 2012"));
        map.put("Сталлоне3", dateFormat.parse("MARCH 1 2012"));
        map.put("Сталлоне4", dateFormat.parse("MAY 30 2012"));
        map.put("Сталлоне5", dateFormat.parse("JUNE 1 2012"));
        map.put("Сталлоне6", dateFormat.parse("AUGUST 1 2012"));
        map.put("Сталлоне7", dateFormat.parse("DECEMBER 1 2012"));
        map.put("Сталлоне8", dateFormat.parse("OCTOBER 1 2012"));
        map.put("Сталлоне9", dateFormat.parse("NOVEMBER 1 2012"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) throws ParseException {
        Map<String, Date> mapCopy = new HashMap<>(map);
        for (Map.Entry<String, Date> dateEntry : mapCopy.entrySet()) {
            if (dateEntry.getValue().getMonth() > 4 && dateEntry.getValue().getMonth() < 8) {
                map.remove(dateEntry.getKey());
            }
        }
    }

    public static void main(String[] args) throws ParseException {
        Map<String, Date> map = createMap();
        removeAllSummerPeople(map);
        map.forEach((k, v) -> System.out.println(k + " - " + v));
    }
}

//по коду:
//DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
//конструктор по определенному шаблону
//dateFormat.parse("MAY 1 2012")
//парсилка стринга по этому шаблону в Дату

//принятый вариант, НО - заточен под покретную дату (т.е. 12 год); если год опускать, будет по умолчанию 1970
/*
            if (dateEntry.getValue().after(dateFormat.parse("MAY 31 2012")) && dateEntry.getValue().before(dateFormat.parse("AUGUST 31 2012"))) {
                map.remove(dateEntry.getKey());
            }
 */

//вариант
/*
        Map<String, Date> copy = new HashMap<>(map);
        for (String key : copy.keySet()) {
            Date date = copy.get(key); //get value by key
            int month = date.getMonth() + 1; //since moth is counted from 0 in outdated Date
            if (month == 6 || month == 7 || month == 8) {
                map.remove(key);
            }
        }
 */

//с форматированием даты... в стринг
/*
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> copy = new HashMap<>(map);
        for (String key : copy.keySet()) {
            String str = dateFormat.format(copy.get(key)); //получаем значение и конвертим в стринг
            if (str.contains("June") || str.contains("July") || str.contains("August")) {
                map.remove(key);
            }
        }
 */
