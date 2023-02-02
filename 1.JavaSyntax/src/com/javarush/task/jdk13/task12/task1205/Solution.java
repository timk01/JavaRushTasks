package com.javarush.task.jdk13.task12.task1205;

/* 
А мне так нужно
*/

public class Solution {
    private static final String UNEXPECTED_TYPE = "Я такого типа числа не жду!";
    private static final int TWO = 2;
    private static final int THREE = 3;
    private static final int TWENTY = 20;

    public static void main(String[] args) {
        System.out.println(toCustomString((byte) 12));
        System.out.println(toCustomString(12));
        System.out.println(toCustomString(12.));
        System.out.println(toCustomString(12L));
    }

    public static String toCustomString(Number number) {
        return number instanceof Byte ?
                number.byteValue() / TWO + "b" : number instanceof Integer ?
                Integer.toString(number.intValue() / THREE) : number instanceof Double ?
                Double.toString(number.doubleValue() * TWENTY) : UNEXPECTED_TYPE;
    }
}

//hint: only FINAL STATIC is a constant and in capical letters

/*
  if (number instanceof Byte) {
            return (Byte) number / 2 + "b";
        } else if (number instanceof Integer) {
            return String.valueOf((Integer) number / 3);
        } else if (number instanceof Double) {
            return String.valueOf((Double) number * 20);
        } else {
            return UNEXPECTED_TYPE;
        }
 */