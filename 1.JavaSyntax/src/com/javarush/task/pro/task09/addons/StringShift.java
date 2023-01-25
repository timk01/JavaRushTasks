package com.javarush.task.pro.task09.addons;

public class StringShift { //using String only, besides char array reverse
    public static void main(String[] args) {
        char c = 'H';
        int i1 = c;
        System.out.println(i1); //72
        int i2 = c << 1;
        System.out.println(i2); //144 (or 36 with >>)


        String s = "Hello World";
        char[] chars = s.toCharArray();
        char[] chars2 = new char[s.length()];
        String s2 = "";
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
            chars2[i] = (char) (chars[i] << 1);
            System.out.println(chars2[i]);
        }
        System.out.println(chars2);
    }
}
