package com.javarush.task.jdk13.task08.addons.sber2;

public class Q10 {
    private int x = 10;

    protected class Inner {
        public static int x = 5; //но с j 16 (в 14 нет статика)

        public void go() {
            System.out.println(x); //new Q10().x
        }
    }

    public static void main(String[] args) {
        Q10 q10 = new Q10();
        Q10.Inner inner = q10.new Inner();
        inner.go();
    }
}

//внимание на строку 7!!!

//распечатает свою "родную" 5

//new Q10().x сравни - распечатает внешнюю (но досутп через экзепмляр класса, т.к. не статик, офк)
//16 строка - создание экземпляра внутреннего класса только через экземпляр внешнего (иначе никак)
//Q10.Inner - обращение к классу
//q10.new Inner() - создание его экземпляра