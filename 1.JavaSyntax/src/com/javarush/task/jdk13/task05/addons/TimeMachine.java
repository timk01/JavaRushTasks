package com.javarush.task.jdk13.task05.addons;

public class TimeMachine {
    int catNumber;

    public void goToFuture(Cat cat, int catNumber, String name) {
        //сравни с
        /*
        cat = new Cat(cat.age);
        cat.age += 10;
         */
        cat.age += 10;
        this.catNumber = catNumber;
        cat.name = name;
    }

    public void goToPast(Cat cat, int catNumber) {
        cat.age -= 10;
    }

    public static void main(String[] args) {
        TimeMachine timeMachine = new TimeMachine();
        Cat barsik = new Cat(5, "Barsik");
        System.out.println(timeMachine.catNumber);

        System.out.println("Сколько лет Барсику в самом начале работы программы?");
        System.out.println(barsik.age);

        timeMachine.goToFuture(barsik, 10, "Pushok"); //copy of value of... link
        System.out.println("А теперь?");
        System.out.println(barsik.age);
        System.out.println("catNumber in future " + timeMachine.catNumber); //10, COPY of value
        System.out.println("catName in future " + barsik.name); //pushok (compare with "new name")

        System.out.println("Елки-палки! Барсик постарел на 10 лет! Живо гони назад!");
        timeMachine.goToPast(barsik, 10); //copy of value of... link
        System.out.println("Получилось? Мы вернули коту его изначальный возраст?");
        System.out.println(barsik.age);
        System.out.println("catNumber in past " + timeMachine.catNumber); //10
    }

    static class Cat {

        int age;
        String name;

        public Cat(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }
}