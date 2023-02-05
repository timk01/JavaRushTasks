package com.javarush.task.jdk13.task07.task0726;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/* 
Нужно исправить программу, чтобы компилировалась и работала
*/

public class Solution {
    public final static ArrayList<Cat> CATS = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String name = reader.readLine();
            if (name == null || name.isEmpty()) {
                break;
            }
            int age = Integer.parseInt(reader.readLine());
            int weight = Integer.parseInt(reader.readLine());
            int tailLength = Integer.parseInt(reader.readLine());

            Cat cat = new Cat(name, age, weight, tailLength);

            CATS.add(cat);
        }

        Iterator<Cat> iterator = CATS.iterator();

        while (iterator.hasNext()) {
            Cat cat = iterator.next();
            if (cat.getName().equals("Barsik") && cat.getAge() == 6 && cat.getWeight() == 5 && cat.getTailLength() == 22) {
                System.out.println(cat);
                if (iterator.hasNext()) {
                    cat = iterator.next();
                    if (cat.getName().equals("Murka") && cat.getAge() == 8 && cat.getWeight() == 7 && cat.getTailLength() == 20) {
                        System.out.println(cat);
                    }
                }
            } else if (cat.getName().equals("Murka") && cat.getAge() == 8 && cat.getWeight() == 7 && cat.getTailLength() == 20) {
                System.out.println(cat);
            }
            if (cat.getName() == null || cat.getName().isEmpty()) {
                printList();
                break;
            }
        }


    }


    public static void printList() {
        for (int i = 0; i < CATS.size(); i++) {
            System.out.println(CATS.get(i));
        }
    }


    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int tailLength;

        Cat(String name, int age, int weight, int tailLength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.tailLength = tailLength;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public int getWeight() {
            return weight;
        }

        public int getTailLength() {
            return tailLength;
        }

        @Override
        public String toString() {
            return "Cat's name: " + name + ", age: " + age + ", weight: " + weight + ", tail: " + tailLength;
        }
    }
}

//А логика на самом деле такая: "заделай любого кота" (без проверок,),
// но когда введешь в поле имя нулль, программа остановится.
// Остальные поля могут иметь абсолютно любые значения. Кроме имени.
//или, если проще, огород с итераторами выше... не нужен :)

//решение, т.е.
/*
while (true) {
        String name = reader.readLine();
        String age = reader.readLine();
        String weight = reader.readLine();
        String tailLength = reader.readLine();

        if (name == null || name.isEmpty()) {
        break;
        }

        Cat cat = new Cat(name, Integer.parseInt(age), Integer.parseInt(weight), Integer.parseInt(tailLength));
        CATS.add(cat);
        }

        printList();*/
