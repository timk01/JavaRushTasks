package com.javarush.task.pro.task09.task0905;

/*
Восьмеричный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        if (decimalNumber <= 0) {
            return 0;
        }
        int i = 0, x = 0;
        while (decimalNumber != 0) {
            x = x + (decimalNumber % 8) * (int) Math.pow(10, i);
            decimalNumber = decimalNumber / 8;
            i++;
        }
        return x;
    }

    public static int toDecimal(int octalNumber) {
        if (octalNumber <= 0) {
            return 0;
        }
        int i = 0, x = 0;
        while (octalNumber != 0) {
            x = x + (octalNumber % 10) * (int) Math.pow(8, i);
            octalNumber = octalNumber / 10;
            i++;
        }
        return x;
    }
}

//Integer.toOctalString(decimalNumber);
//Long.toOctalString(decimalNumber)
//Integer.parseInt(String, int); Long.parseLong(String, int) - хитрый.
//Integer.toString(int, int) //https://www.javatpoint.com/java-integer-tostring-method
//https://madformath.com/calculators/basic-math/base-converters/octal-to-decimal-converter-with-steps/octal-to-decimal-converter-with-steps
//и расписать на бумажке