package com.javarush.task.jdk13.task02.addon;

public class PrimitiveOperations {
    public static void main(String[] args) {
        int bigNumber = 1000_000;

        short littleNumber = 1000;

        littleNumber = (short) bigNumber;
        //1000_000 % 65536 = 16960; 16960 > 32767 ? нет. оставляем 16960

        System.out.println(littleNumber);


        int bigNumber2 = 1020_000;

        short littleNumber2 = 1000;

        littleNumber2 = (short) bigNumber2;
        //1020_000 % 65536 = 36960; 36960 > 32767 ? да. 36960-65536 = -28576

        System.out.println(littleNumber2);


        byte shortLittleNumber3 = 127;

        shortLittleNumber3 = (byte) bigNumber2;
        //1020_000 % 256 = 96; 96 > 127 ? нет. оствим.

        System.out.println(shortLittleNumber3);


        double d = 2.7;

        long x = (int) d;
        System.out.println(x); //2
    }
}
