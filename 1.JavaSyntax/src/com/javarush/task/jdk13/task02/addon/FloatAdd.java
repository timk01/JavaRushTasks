package com.javarush.task.jdk13.task02.addon;

public class FloatAdd {
    public static void main(String[] args) {
        float f = 3 / 5; //0
        float f1 = 3.0F / 5; //can't just 3.0/5, since by deault it's double //or 5.0F or both
        int a = 3, b = 5;
        float f3 = a / b; //same as f - nothing
        float f4 = (1 * 0.1f) / b; //or, any of parts. see above
        float f5 = (float) a / b;
        System.out.println(f5);
        float f6 = (float) (a / b); //0
    }
}
