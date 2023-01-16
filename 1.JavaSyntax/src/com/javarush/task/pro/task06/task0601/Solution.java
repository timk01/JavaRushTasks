package com.javarush.task.pro.task06.task0601;

/* 
Разделяй понятия
*/

public class Solution {
    private static StringBuilder sb;

    public static void main(String[] args) {
        printHydrogenInfo();
        printJavaInfo();
    }

    public static void printJavaInfo() {
        sb = new StringBuilder()
                .append("Остров Ява:\n")
                .append("Входит в состав Индонезии.\n")
                .append("На острове зародились государства Матарам, Маджапахит, Демак.\n")
                .append("Ява является самым населенным островом в мире:\n")
                .append("Общее население — 140 млн. человек.\n")
                .append("Плотность населения — 1061 чел/км.кв.\n")
                .append("Здесь производят один из знаменитых сортов кофе — Копи Лювак.\n");
        System.out.println(sb);
    }

    public static void printHydrogenInfo() {
        sb = new StringBuilder()
                .append("Водород:\n")
                .append("Это химический элемент периодической системы с обозначением H и атомным номером 1.\n")
                .append("Является самым легким элементом таблицы.\n")
                .append("Водород применяется в:\n")
                .append("-Химической промышленности;\n")
                .append("-Нефтеперерабатывающей промышленности;\n")
                .append("-Авиации;\n")
                .append("-Электроэнергетике.\n");
        System.out.println(sb);
    }


}
