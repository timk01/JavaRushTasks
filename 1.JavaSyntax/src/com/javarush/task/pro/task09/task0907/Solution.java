package com.javarush.task.pro.task09.task0907;

import java.util.Objects;

/* 
Шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256; //1256
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        /*String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));*/
        String hexNumber = "1";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        StringBuilder sb = new StringBuilder("");
        if (decimalNumber <= 0) {
            return sb.toString();
        }
        while (decimalNumber != 0) {
            sb.append(HEX.charAt(decimalNumber % 16));
            decimalNumber /= 16;
        }
        return sb.reverse().toString();
    }

    public static int toDecimal(String hexNumber) {
        if (Objects.equals(hexNumber, null) || Objects.equals(hexNumber, "")) {
            return 0;
        }
        int x = 0;
        for (int i = 0; i < hexNumber.length(); i++) {
            x = 16 * x + HEX.indexOf(hexNumber.charAt(i));
            //char[]z=hexNumber.toCharArray();
            //Character.getNumericValue(hexNumber[i])
        }
        return x;
    }
}

/*
 String hex = "";
    if (decimalNumber <= 0) return hex;
    char[] HEXAr = HEX.toCharArray();
    while(decimalNumber != 0){
        hex = HEXAr[decimalNumber%16] + hex;
        decimalNumber /= 16;
    }
    return  hex;
 */
/*
        String hexNumber = "";
        if (decimalNumber <= 0) {
            return hexNumber;
        }

        while (decimalNumber != 0) {
            hexNumber = HEX.charAt(decimalNumber % 16) + hexNumber;
            decimalNumber = decimalNumber / 16;
        }
        return hexNumber;
 */
