package com.javarush.task.jdk13.task05.task0528;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/* 
Вывести на экран сегодняшнюю дату
*/

public class Solution {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        String aStringToPrint = localDate.format(formatter);
        System.out.println(aStringToPrint);
        
        //simpler
/*        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy");
        System.out.println(simpleDateFormat.format(new Date()));*/
    }
}
