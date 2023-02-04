package com.javarush.task.jdk13.task07.array_list_generics.generics.arraylistandgeneric;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class DeletionAddArrayList {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        Cat catPushok = new Cat("Пушок");
        Cat catBegemot = new Cat("Бегемот");
        Collections.addAll(
                cats,
                new Cat("Томас"),
                catBegemot,
                new Cat("Филипп Маркович"),
                catPushok,
                new Cat("Филипп Маркович")
        );

        System.out.println(cats);

        //удалить можно:
        //1. с помощью копии (в конце)
        //2. с пмощью цикла
        //3. с помощью итератора

/*        for (Cat cat : cats) {
          //classic concurrentExc here: cannot simultaneously foreach collections and modify it

            if (cat.getName().equals("Бегемот")) {
                cats.remove(cat);
                //cats.add(new Cat("Сейлем Сэйберхеген")); //same shit
            }
        }*/

        //but CAN (though, not recommended)
/*        for (int i = 0; i < cats.size(); i++) {
            if (cats.get(i).equals(catBegemot)) {
                cats.remove(i);
                i--;
            }
            if (cats.get(i).equals(catPushok)) {
                cats.add(i, catPushok); //double Pushok near
                i++;
            }
        }*/

        /*Iterator<Cat> catIterator = cats.iterator();//создаем итератор
        while(catIterator.hasNext()) {//до тех пор, пока в списке есть элементы

            Cat nextCat = catIterator.next();//получаем следующий элемент
            if (nextCat.getName().equals("Филипп Маркович")) {
                catIterator.remove();//удаляем кота с нужным именем
            }
        }*/

        cats.removeIf(nextCat -> nextCat.getName().equals("Филипп Маркович")); //it's the same

        ListIterator<Cat> catIterator = cats.listIterator(cats.size());//listiterator on specific position
        while (catIterator.hasPrevious()) {

            Cat nextCat = catIterator.previous();//previous!
            if (nextCat.getName().equals("Филипп Маркович")) {
                catIterator.remove();//удаляем кота с нужным именем
            }
        }

        //with copy

        ArrayList<Cat> listCopy = new ArrayList(cats); //compare with = cats; (in this case we just use link)

        for (Cat cat : listCopy) {
            if (cat.getName().equals("Филипп Маркович"))
                cats.remove(cat);
        }
        

        System.out.println(cats);


        while (catIterator.hasNext()) {

            Cat nextCat = catIterator.next();
            if (nextCat.getName().equals("Бегемот")) {
                catIterator.add(catPushok);//+1 cat right after Begemot
            }
        }

        System.out.println(cats);


        //can do "solo" too
/*        cats.remove(1); //by index
        cats.remove(catPushok); //by link*/

        System.out.println(cats.toString());
    }
}
