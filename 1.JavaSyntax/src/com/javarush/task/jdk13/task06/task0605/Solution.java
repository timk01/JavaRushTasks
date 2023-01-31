package com.javarush.task.jdk13.task06.task0605;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/* 
Индекс массы тела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            double index = weight / (height * height);
            if (BigDecimal.valueOf(index).compareTo(IndexesEnum.THIN.getFatNumber()) < 0) {
                System.out.printf("Недовес: меньше, чем %.1f", IndexesEnum.THIN.getFatNumber());
            } else if (BigDecimal.valueOf(index).compareTo(IndexesEnum.THIN.getFatNumber()) >= 0
                    && BigDecimal.valueOf(index).compareTo(IndexesEnum.NORMAL.getFatNumber()) < 0) {
                System.out.printf("Нормальный: между %.1f и %.0f%n", IndexesEnum.THIN.getFatNumber(), IndexesEnum.NORMAL.getFatNumber());
            } else if (BigDecimal.valueOf(index).compareTo(IndexesEnum.NORMAL.getFatNumber()) >= 0
                    && BigDecimal.valueOf(index).compareTo(IndexesEnum.FAT.getFatNumber()) < 0) {
                System.out.printf("Избыточный вес: между %.0f и %.0f%n", IndexesEnum.NORMAL.getFatNumber(), IndexesEnum.FAT.getFatNumber());
            } else if (BigDecimal.valueOf(index).compareTo(IndexesEnum.FAT.getFatNumber()) >= 0) {
                System.out.printf("Ожирение: %.0f или больше%n", IndexesEnum.FAT.getFatNumber());
            }
        }

        enum IndexesEnum {
            THIN(BigDecimal.valueOf(18.5)),
            NORMAL(BigDecimal.valueOf(25)),
            FAT(BigDecimal.valueOf(30));

            private final BigDecimal fatNumber;

            IndexesEnum(BigDecimal fatNumber) {
                this.fatNumber = fatNumber;
            }

            public BigDecimal getFatNumber() {
                return fatNumber;
            }
        }
    }
}
