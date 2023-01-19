package com.javarush.task.pro.task09.addons;

public class FloatDoubleEx {
    public static void main(String[] args) {
        double a = 100;
        double a2 = 100.; //legal! (surprize)
        double a3 = .0; //legal!
        //double a4 = .; //illegal ( . , .D / .d / .f / .F)
        //float a5 = 100.0; //illegal: default type is... double
        double a6 = 100D;
        double a7 = 100d;
        //int a8 = 100D;//missmatch. should be double or without D

        float f = 1.23E2F;
        System.out.println(f); //1.23*10^2=123.0
        float f2 = 1.23E0F; //1.23EF - cannot. need to pinpoint degree
        System.out.println(f2); //even THIS is ok, 1.23
        float f3 = 1.23E-6f; //1.23*10^-6; 0.00000123
        float f4 = 1E6F; //1.0*106 or 1000000.0
        float f5 = 1E-10F; //1.0*10-10 or 0.0000000001

        System.out.println(1.11E5); //1.11*100000 = 111000.0

    }
}
