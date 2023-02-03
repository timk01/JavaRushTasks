package com.javarush.task.jdk13.task07.array_list_generics.generics;

public class Program {

    public static void main(String[] args) {

        Account acc1 = new Account("cid2373", 5000);
        Account acc2 = new Account(53757, 4000);
        System.out.println(acc1.getId());
        System.out.println(acc2.getId());
    }
}

class Account {

    private String id;
    private int sum;

    <T> Account(T id, int sum) { //обобщенный конструктор (все можно привести к стирнгу)
        this.id = id.toString();
        this.sum = sum;
    }

    public String getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}