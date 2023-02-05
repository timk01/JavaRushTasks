package com.javarush.task.jdk13.task07.task0724;

/* 
Семья
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Human grandMother1 = new Human("Elena", false, 70);
        Human grandMother2 = new Human("Nadesda", false, 78);
        Human grandFather1 = new Human("Boris", true, 69);
        Human grandFather2 = new Human("Evgeniy", true, 85);
        Human mother = new Human("Elizaveta", false, 40, grandFather2, grandMother1);
        Human father = new Human("Aleksey", true, 45, grandFather1, grandMother2);
        Human child1 = new Human("Alexander", true, 17, father, mother);
        Human child2 = new Human("Semen", true, 8, father, mother);
        Human child3 = new Human("Olga", false, 5, father, mother);
        List<Human> humanList = new ArrayList<Human>(List.of(
                grandMother1, grandMother2, grandFather1, grandFather2, mother, father, child1, child2, child3));
        humanList.forEach(System.out::println);
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this(name, sex, age);
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}

//можно в теории суватьв  конструктор
//            System.out.println(this);

//text += "Role: " + this.getClass().getName().toString();
//и да. Role: com.javarush.task.jdk13.task07.task0724.Solution$Huma