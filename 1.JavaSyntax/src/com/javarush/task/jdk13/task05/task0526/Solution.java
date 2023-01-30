package com.javarush.task.jdk13.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man ivan = new Man("Ivan", 36, "Moscow");
        Man petr = new Man("Petr", 18, "Tolyatti");
        Woman maria = new Woman("Maria", 28, "SPB");
        Woman elena = new Woman("Elena", 50, "Singapoure");
        System.out.println(ivan);
        System.out.println(petr);
        System.out.println(maria);
        System.out.println(elena);
    }

    public static class Man {
        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return name + " " + age + " " + address;
        }
    }

    public static class Woman {
        private String name;
        private int age;
        private String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return name + " " + age + " " + address;
        }
    }
}
