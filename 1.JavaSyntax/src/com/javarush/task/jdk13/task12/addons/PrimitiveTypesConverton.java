package com.javarush.task.jdk13.task12.addons;

public class PrimitiveTypesConverton {
    public static void main(String[] args) {
        long l = 123456789;
        float f = l;
        System.out.println(f); //1.23456792E8 -> 6-7 digits
        double d = l;
        System.out.println(d); //1.23456789E8
        //long l2 = (long) f * f; //won't compile
        long l2 = (long) (f * f); //OK

        long aLongNumber = 1_000_000;
        short shortedLongNumber = (short) aLongNumber;
        //1000000 % 65536 = 16960. 16960 > 23768 ? оставляем (иначе бы вычитали из числа 65536)

        char aChar = 'A';
        int anInt = aChar; //OK
        aChar = (char) anInt;
        System.out.println(aChar); //A

        short aShort = (short) aChar; //-32768...32767 (while char 0... 65535)
        aChar = (char) aShort; //and wise versa

        /*

    All byte and short values are promoted to int.
    If one operand is a long, the whole expression is promoted to long.
    If one operand is a float, the entire expression is promoted to float.
    If any of the operands is double, the result is double.

         */

        byte a = 110;
        byte b = 120;
        //byte c = a * b;   // ошибка

        //110 * 120 будет 13, 200, что несколько больше, чем максимальное значение типа byte:127

        //byte c = a + b;   // ошибка

        int c = a * b; //OK
        byte c2 = (byte) (a * b); //(byte) a * b; won't work due to priority (byte) on =

        //https://javarush.com/quests/lectures/questsyntax.level10.lecture04
        //мой коммент

    }
}
