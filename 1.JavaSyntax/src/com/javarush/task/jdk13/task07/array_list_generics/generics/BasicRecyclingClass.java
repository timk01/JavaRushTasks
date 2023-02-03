package com.javarush.task.jdk13.task07.array_list_generics.generics;

public class BasicRecyclingClass implements GarbageHandler<Paper, Plastic> {
    //concrete! types here (concrete class either)

    @Override
    public void handle(Paper whatIsRecycled, Plastic howItIsDone) {

    }

    @Override
    public <E> void tranfer(E dangerousWaste) {
        
    }
}
