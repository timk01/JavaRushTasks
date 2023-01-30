package com.javarush.task.jdk13.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat tomCat = new Cat("Tom", 25, 'M');
        Dog spikeDog = new Dog("Spike", "good", true);
    }

    public static class Mouse {
        private String name;
        private int height;
        private int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat {
        private String name;
        private int height;
        private char sex;

        public Cat(String name, int height, char sex) {
            this.name = name;
            this.height = height;
            this.sex = sex;
        }
    }

    public static class Dog {
        private String name;
        private String mood;
        private boolean bonePossessiveness;

        public Dog(String name, String mood, boolean bonePossessiveness) {
            this.name = name;
            this.mood = mood;
            this.bonePossessiveness = bonePossessiveness;
        }
    }
}
