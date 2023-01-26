package com.javarush.task.jdk13.task05.task0501;

/* 
Кошачья бойня(1)
*/

public class Solution {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Pushok", 2, 3, 2);
        Cat cat2 = new Cat("Dymok", 3, 2, 3);
        Cat cat3 = new Cat("Marfa", 3, 6, 6);

        System.out.println(cat1.fight(cat2));
        System.out.println(cat1.fight(cat3));
        System.out.println(cat2.fight(cat3));
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int firstParamDiff = Integer.compare(this.age, anotherCat.age);
            int secondParamDiff = Integer.compare(this.weight, anotherCat.weight);
            int thirdParamDiff = Integer.compare(this.strength, anotherCat.strength);

            return (firstParamDiff + secondParamDiff + thirdParamDiff) > 0;
        }

    }
}

//решение в лоб (кстати проверку прошло)
/*            if (this.age == anotherCat.age && this.weight == anotherCat.weight && this.strength == anotherCat.strength) {
                return false;
            }
            if (this.age > anotherCat.age) {
                return this.weight > anotherCat.weight
                        || this.strength > anotherCat.strength
                        || (this.weight == anotherCat.weight && this.strength == anotherCat.strength);
            } else if (this.age == anotherCat.age) {
                return this.weight > anotherCat.weight && this.strength >= anotherCat.strength || this.weight >= anotherCat.weight && this.strength > anotherCat.strength;
            } else if (this.weight > anotherCat.weight) {
                return this.strength > anotherCat.strength;
            }
            return false;
        }*/

//testCases
/*
            Cat cat1 = new Cat("Pushok", 2, 3, 2);
            Cat cat2 = new Cat("Dymok", 3, 2, 3);
            Cat cat3 = new Cat("Marfa", 3, 6, 6);
            Cat cat4 = new Cat("Marfa2", 2, 6, 7);
            Cat cat5 = new Cat("Marfa2Clone", 2, 6, 7);
            System.out.println(cat1.fight(cat2));
            System.out.println(cat2.fight(cat1));

            System.out.println(cat1.fight(cat3));
            System.out.println(cat3.fight(cat1));

            System.out.println(cat2.fight(cat3));
            System.out.println(cat3.fight(cat2));

            System.out.println(cat3.fight(cat4));
            System.out.println(cat4.fight(cat3));

            System.out.println(cat4.fight(cat5));
            System.out.println(cat5.fight(cat4));
 */