package com.javarush.task.jdk13.task07.array_list_generics.generics;

public class RecyclingClassWithOneGenericOneConcreteType<T extends Handler> implements GarbageHandler<Paper, T> {
    //marvellous! arbageHandler<Paper, T> will NOT work WITHOUT bound

    @Override
    public void handle(Paper whatIsRecycled, T howItIsDone) { //here too

    }

    @Override
    public <E> void tranfer(E dangerousWaste) {

    }
}
