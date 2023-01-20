package com.javarush.task.pro.task09.task0908;

import java.util.Objects;
import java.util.regex.Pattern;

/* 
Двоично-шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        String test = "  ";
        System.out.println(test.isBlank());
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        String hex = "";
        if (binaryNumber == null || binaryNumber.isEmpty() || !binaryNumber.matches("[01]+")) { //!binaryNumber.matches("^[01]+$")
            return ""; //binaryNumber.isEmpty() or binaryNumber.isEmpty() or Objects.equals(binaryNumber, "") ? rather 2
        }

        StringBuilder sb = new StringBuilder(binaryNumber);
        if (binaryNumber.length() % 4 != 0) {
            int missedZeros = 4 - (binaryNumber.length() % 4);
            switch (missedZeros) {
                case 1:
                    sb.insert(0, '0');
                    break;
                case 2:
                    sb.insert(0, "0".repeat(2));
                    break;
                case 3:
                    sb.insert(0, "0".repeat(3));
                    break;
            }
        }

        StringBuilder hexSb = new StringBuilder(hex);
        for (int i = 0; i < sb.length(); i = i + 4) {
            hexSb = sb.substring(i, i + 4).contains("0000") ?
                    hexSb.append("0") :
                    hexSb.append(toHex(toDecimal(sb.substring(i, i + 4))));
        }
        return hexSb.toString();
    }

    public static int toDecimal(String binaryNumber) {
        if (Objects.equals(binaryNumber, null) || binaryNumber.isEmpty()) {
            return 0;
        }
        int x = 0;
        for (int i = 0; i < binaryNumber.length(); i++) {
            x += Character.getNumericValue(binaryNumber.charAt(binaryNumber.length() - 1 - i)) * Math.pow(2, i);
        }
        return x;
    }

    public static String toHex(int decimalNumber) {
        StringBuilder sb = new StringBuilder();
        if (decimalNumber <= 0) {
            return "";
        }
        while (decimalNumber != 0) {
            sb.append(HEX.charAt(decimalNumber % 16));
            decimalNumber /= 16;
        }
        return sb.reverse().toString();
    }

    public static String toBinary(String hexNumber) {
        String binary = "";
        if (Objects.equals(hexNumber, null) || hexNumber.isEmpty()) {
            return binary;
        }
        if (!(Pattern.matches(("[a-f,0-9]+"), hexNumber))) {
            return binary;
        }
        char[] chars = hexNumber.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < hexNumber.length(); i++) {
            if (String.valueOf(chars[i]).equals("0")) {
                sb.append("0000");
            } else {
                sb.append(toBinary(hexToDecimal(String.valueOf(chars[i]))));
            }
        }
        return sb.toString();
    }

    public static int hexToDecimal(String hexNumber) {
        if (Objects.equals(hexNumber, null) || hexNumber.isEmpty()) {
            return 0;
        }
        int x = 0;
        for (int i = 0; i < hexNumber.length(); i++) {
            x = 16 * x + HEX.indexOf(hexNumber.charAt(i));
        }
        return x;
    }

    public static String toBinary(int decimalNumber) {
        String binaryNumber = "";
        if (decimalNumber <= 0) {
            return binaryNumber;
        }
        while (decimalNumber != 0) {
            binaryNumber = decimalNumber % 2 + binaryNumber;
            decimalNumber = decimalNumber / 2;
        }
        return String.format("%04d", Integer.valueOf(binaryNumber));
    }
}

//old solution
/*
public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        //String binaryNumber = "100111010000";
        //100111010000
        //111010000 (9)--> 000111010000
        //1111010000 (10)--> 001111010000
        //111010000 (11)--> 011111010000

        String binaryNumber = "11111010000";


        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
//        String hexNumber = "6";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        String hex = "";
        if (Objects.equals(binaryNumber, null) || Objects.equals(binaryNumber, "")) {
            return hex;
        }
        if (!binaryNumber.matches("^[01]+$")) {
                return hex;
                }
                StringBuilder sb = new StringBuilder(binaryNumber);
                if (binaryNumber.length() % 4 != 0) {
                int difference = binaryNumber.length() % 4;
                if (difference == 1) {
                String repeat = "0".repeat(3);
                sb.insert(0, repeat);
                }
                if (difference == 2) {
                String repeat = "0".repeat(2);
                sb.insert(0, repeat);
                }
                if (difference == 3) {
                sb.insert(0, '0');
                }
                }
                StringBuilder hexSb = new StringBuilder(hex);
                for (int i = 0; i < sb.length(); i = i + 4) {
        if (sb.substring(i, i + 4).contains("0000")) {
        hexSb.append("0");
        } else {
        hexSb.append(toHex(toDecimal(sb.substring(i, i + 4))));
        }
        }
        return hexSb.toString();
        }

public static int toDecimal(String binaryNumber) {
        if (Objects.equals(binaryNumber, null) || Objects.equals(binaryNumber, "")) {
        return 0;
        }
        int x = 0;
        for (int i = 0; i < binaryNumber.length(); i++) {
        x += Character.getNumericValue(binaryNumber.charAt(binaryNumber.length() - 1 - i)) * Math.pow(2, i);
        }
        return x;
        }

public static String toHex(int decimalNumber) {
        StringBuilder sb = new StringBuilder();
        if (decimalNumber <= 0) {
        return "";
        }
        while (decimalNumber != 0) {
        sb.append(HEX.charAt(decimalNumber % 16));
        decimalNumber /= 16;
        }
        return sb.reverse().toString();
        }

public static String toBinary(String hexNumber) {
        String binary = "";
        if (Objects.equals(hexNumber, null) || Objects.equals(hexNumber, "")) {
        return binary;
        }
        if (!(Pattern.matches(("[a-f,0-9]+"), hexNumber))) {
        return binary;
        }
        char[] chars = hexNumber.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < hexNumber.length(); i++) {
        if (String.valueOf(chars[i]).equals("0")) {
        sb.append("0000");
        } else {
        sb.append(toBinary(hexToDecimal(String.valueOf(chars[i]))));
        }
        }
        return sb.toString();
        }

public static int hexToDecimal(String hexNumber) {
        if (Objects.equals(hexNumber, null) || Objects.equals(hexNumber, "")) {
        return 0;
        }
        int x = 0;
        for (int i = 0; i < hexNumber.length(); i++) {
        x = 16 * x + HEX.indexOf(hexNumber.charAt(i));
        }
        return x;
        }

public static String toBinary(int decimalNumber) {
        String binaryNumber = "";
        if (decimalNumber <= 0) {
        return binaryNumber;
        }
        while (decimalNumber != 0) {
        binaryNumber = decimalNumber % 2 + binaryNumber;
        decimalNumber = decimalNumber / 2;
        }
        return String.format("%04d", Integer.valueOf(binaryNumber));
        }
        }
 */
