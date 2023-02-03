package com.javarush.task.jdk13.task07.array_list_generics.generics;

public interface GarbageHandler<T extends Garbage, S extends Handler> {
    void handle(T whatIsRecycled, S howItIsDone);

    <E> void tranfer(E dangerousWaste);
    //additionally generic on return type (even if we do not have here returnedType)
    //method doesn't need any of T or S, keep note that <E> allows using E (just E we can't use)
    //when we fisrt refer to this type, we use <E> in method

    //T extends Garbage, S extends Handler (the same as Box, but in both cases it has upper bound)
}
