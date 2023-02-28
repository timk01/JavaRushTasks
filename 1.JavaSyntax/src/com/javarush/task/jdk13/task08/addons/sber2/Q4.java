package com.javarush.task.jdk13.task08.addons.sber2;

public class Q4 {
    enum Cars {
        //было просто BMW, AUDI, BENTLEY;

        BWM(1), AUDI(2), BENTLEY(3);

        int i;

        Cars(int i) {
            this.i = i;
        }

        public int getI() {
            return i;
        }
    }

    public static void main(String[] args) {
        Cars f = Cars.BENTLEY; //Cars.BMW;
        switch (f.getI()) {
            //switch (f) {
            case 0:
                System.out.println("BMW");
            case 1:
                System.out.println("AUDI");
            case 2:
                System.out.println("BENTLEY");
                break;
            default:
                System.out.println("missing car");
        }
    }
}

//в состоянии СЕЙЧАС (вернуть 5 и 2 строки) - он не скомпилируется

/*
свитч требует енум. а мы ему даем... инт. Это 1. (а это 23 строка)
изменить можно, предоставив свитч
в измененном формат будет свитч (но вообще тут везде нужны брейки, даже в дефолте)
а вот если бы было Cars.BMW, он бы шпарил с кейса 1 (не с нуля, внимание),
прошел бы его, дошел до 2, прошел его, дошел до брейка, вылетел
АУДИЮ БЕНТЛИ (потому что у БМВ номер... 1)
 */

//https://www.baeldung.com/java-enum-values
