package com.javarush.task.pro.task09.task0906;

import java.util.Objects;

/* 
Двоичный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        /*int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));*/
        int decimalNumber = 1;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1211111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        String binaryNumber = "";
        if (decimalNumber <= 0) {
            return binaryNumber;
        }
        while (decimalNumber != 0) {
            binaryNumber = binaryNumber + decimalNumber % 2;
            decimalNumber = decimalNumber / 2;
        }
        return binaryNumber;
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
}


//по первой задаче. не проходит проверку, хотя результат - выдает (прежняя логика)
/*        int i = 0, x = 0;
        while (decimalNumber != 0) {
            x = x + (decimalNumber % 2) * (int) Math.pow(10, i);
            decimalNumber = decimalNumber / 2;
            i++;
        }
        return Integer.toString(binaryNumber);*/

//по второй. см. подсказку.
/*
Изначально берется крайнее правое число из двоичного представления.
С каждой итерацией цикла берется следующее число ближе к началу двоичного представления.
 */

/*
крайнее правая - это последняя по индексу (т.е. будет что-т типа длина - 1 - i)
как найти число ? - взять чар по этому индексу...
чар умножать нельзя. потому надо преобразовать чар в инт. как сделать это ? с помощью метода у Чара - getNumericValue
 */

//или можно предварительно привести строку в массив чаров и
//char[] binaryCharArr = binaryNumber.toCharArray();
//Character.getNumericValue(binaryCharArr[binaryCharArr.length - i - 1])