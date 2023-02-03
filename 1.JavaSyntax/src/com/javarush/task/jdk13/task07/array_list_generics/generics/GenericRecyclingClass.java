package com.javarush.task.jdk13.task07.array_list_generics.generics;

public class GenericRecyclingClass<T extends Garbage, S extends Handler> implements GarbageHandler<T, S> {
    //here all ok, since T, S we have in class too!

    @Override
    public void handle(T whatIsRecycled, S howItIsDone) {

    }

    @Override
    public <E> void tranfer(E dangerousWaste) {

    }

    <E, R> int doSmth(E from, R to) {
        return 0;
    }
}
