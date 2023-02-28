package com.javarush.task.jdk13.task08.addons.sber2;

public class Q6 {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("1" + i++);
        //System.out.println(i);
    }
}

//10

/*
конкатенация. плюс ++ работает ПОСЛЕ нее - см. строку нумер 7 (сравни с ++i). соответственно получается "1" + "0"
 */