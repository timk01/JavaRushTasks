package com.javarush.task.jdk13.task08.addons;

import java.util.HashSet;
import java.util.Set;

public class HashSetExampleWithMutableField {
    public static void main(String[] args) {
        Letter aNewLetter = new Letter('a');
        System.out.println(Character.toString('a').hashCode()); //97
        Set<Letter> letters = new HashSet<>();
        letters.add(aNewLetter);
        System.out.println(letters.contains(aNewLetter) + " " + letters.size());

        System.out.println(aNewLetter.equals(new Letter('a')));
        aNewLetter.setCh('c');

        System.out.println(Character.toString('c').hashCode()); //99
        System.out.println(Character.toString('c').hashCode()); //99
        Letter aNewLetter2 = new Letter('a');
        letters.add(aNewLetter2);
        System.out.println(aNewLetter.equals(aNewLetter2));
        System.out.println(letters.contains(aNewLetter2) + " " + letters.contains(aNewLetter) + " " + letters.size());

        //и да, Сет не имеет метода Гет. Только через итераторы
    }
}

class Letter {
    private char ch;

    public Letter(char ch) {
        this.ch = ch;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    public char getCh() {
        return ch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Letter letter = (Letter) o;
        return ch == letter.ch;
    }

    @Override
    public int hashCode() {
        return ch; //Objects.hash(ch)
    }

    @Override
    public String toString() {
        return "Letter{" +
                "ch=" + ch +
                '}';
    }
}

//когда положили туда, положили в бакет, скажем, 97%16=1, выдал хешкод. для ВСЕГО объекта леттер (для всех полей)
//здесь конкретно, например это 97 (т.е. чар)
//теперь. положили его в бакет = 1.
//letters.contains(aNewLetter) - ищет в сете объект а (у него поле а),
//делает ту же операцию: высчитывает хешкод, остаток отделения и смотрит - есть корзина нумер 1. нашел.
//при изменении поля, хэшкод меняется с 97 на 99.
//теперь у нас объект тот же (?), но с полем с. тут важно что: что хэшкод поменялся.
//когда следом вызывем ТЕПЕРЬ letters.contains(aNewLetter), он его ищет по тому же принципу, но остаток отделения
//(и корзина) уже 3. ну, а там ничего нет. КЛЮЧ у ОБЪЕКТА ПОМЕНЯЛСЯ.
//потому и размер коллекции не изменился.

//ЗЫ: и да, у сета нет метода гет. через итераторы.
