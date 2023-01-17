package com.javarush.task.jdk13.task02.addon;

import java.util.Date;

public class DateAdd { //а вообще, класс устаревший - см. Календарь
    public static void main(String[] args) throws InterruptedException {
        Date date = new Date();
        System.out.println("curr time: " + date); //Tue Jan 17 19:40:35 MSK 2023

        //2
        Date currentTime = new Date();
        Thread.sleep(5);
        Date timeAfterSleep = new Date();
        System.out.println("delay is: " + (currentTime.getTime() - timeAfterSleep.getTime()));
        //правда, нестабильная хрень: то 7, то 6. но не 5

        //3
        Date startTime = new Date();
        System.out.println("startTime.getTime(): " + startTime.getTime());
        long endTime = startTime.getTime() + 5;
        Date endDate = new Date(endTime);

        Thread.sleep(3000);

        Date currentTime2 = new Date();
        if (currentTime2.after(endDate)) {
            System.out.println("End time!");
        }

        //4 все прям устаревшее...
        int hours = currentTime.getHours();
        int mins = currentTime.getMinutes();
        int secs = currentTime.getSeconds();

        System.out.println("Time from midnight " + hours + ":" + mins + ":" + secs);

        //5
        //Сколько дней прошло с начала года:
        Date yearStartTime = new Date();
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);

        yearStartTime.setDate(1); //1.01.2023, месяц ниже - с нуля
        yearStartTime.setMonth(0); //Should be one of: Calendar.JANUARY, Calendar.FEBRUARY, Calendar.MARCH, Calendar.APRIL, Calendar.MAY,

        Date currentRealTime = new Date();
        long differene = currentRealTime.getTime() - yearStartTime.getTime();
        long msInday = 60 * 60 * 24 * 1000;
        int daysPassed = (int) (differene / msInday);
        System.out.println("Days from start of year: " + daysPassed);

    }
}
