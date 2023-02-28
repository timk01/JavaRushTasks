package com.javarush.task.jdk13.task08.addons.sber2;

public class Q12 {
    enum Cars {
        BMW, AUDI, BENTLEY
    }

    public static void main(String[] args) {
        System.out.println(Cars.AUDI.ordinal());
    }
}

//1
//порядковый номер (тут как в массиве, с 0 индексы)

//да, обрати внмиание:
//; (точка с запятой НЕ нужна если чисто перечисление безо всего) - хотя она и может быть, она тт лишняя