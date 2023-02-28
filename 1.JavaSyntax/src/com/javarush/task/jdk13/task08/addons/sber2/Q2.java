package com.javarush.task.jdk13.task08.addons.sber2;

import java.util.ArrayList;
import java.util.List;

public class Q2 {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add(7);
        for (Object o : list) {
            System.out.print(o);
        }
        //Integer.parseInt((String) list.get(0));
    }
}

//onetwo7

/*
почему ? вообще тут сырой тип. и если бы например вызвать строчку 15 (т.е. вопробовать распарсить как Инт СТирнг, будет ошибка)
потому что сырой тип не контролирует тип на входе. "суй что хочешь"
почему не будет ошибки ?
потому что принтит метод объект (а все может быть приведено к объекту)
точнее, его toString предсатвление.
eturns a String object representing this Integer's value. - вполне себе для Интежера.
(ну а положить мы его в лист можем как 7, потому что автоупаковка)
 */