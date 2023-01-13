package com.javarush.task.jdk13.task07.array_remember;

import java.util.Arrays;

public class ObjectToString {

    @Override
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    //дефолтовое. т.е. имя(от класса) + собака + хеш в 16-ричной форме

    public static void main(String[] args) {
        int[] intArr1 = new int[1];
        System.out.println(intArr1); //[I@3d075dc0 //I - интежер

        String[] stringArr = new String[1];
        System.out.println(stringArr); //Ljava.lang.String;@214c265e

        ObjectToString[] objectToStrings = new ObjectToString[1];
        System.out.println(objectToStrings);
        //[Lcom.javarush.task.jdk13.task07.array_remember.ObjectToString;@448139f0
        //т.е. полный путь. + название класса. для не-примитивов.

        System.out.println(Arrays.toString(new int[1]));

        System.out.println(toString(null));
        System.out.println(toString(new Integer[1]));
        System.out.println(toString(new String[]{"omg", "klop"}));
        System.out.println(toString(new String[]{}));
        System.out.println(toString(new String[0]));
    }

    //Arrays.toString(Object[] a) implementation
    public static String toString(Object[] a) {
        if (a == null) {
            return "null";
        }

        int iMax = a.length - 1;
        if (iMax == -1) {
            return "[]";
        }

        StringBuilder b = new StringBuilder("[");
        for (int i = 0; ; i++) {
            b.append(String.valueOf(a[i]));
            if (i == iMax) {
                return b.append(']').toString();
            }
            b.append(", ");
        }
    }
}















/*    public static String toString(Object[] a) {
        if (a == null)
            return "null";

        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(String.valueOf(a[i]));
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
    }*/
