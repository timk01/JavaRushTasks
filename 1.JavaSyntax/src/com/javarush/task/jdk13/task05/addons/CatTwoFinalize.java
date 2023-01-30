package com.javarush.task.jdk13.task05.addons;

public class CatTwoFinalize {
    private String name;
    private static long garbageCounterFinalize;

    public CatTwoFinalize(String name) {
        this.name = name;
    }

    public CatTwoFinalize() {
    }

    public static void main(String[] args) throws Throwable {

        for (int i = 0; i < 1000000; i++) {

            CatTwoFinalize cat = new CatTwoFinalize();
            cat = null;//вот здесь первый объект становится доступен сборщику мусора
        }
    }

    @Override
    protected void finalize() throws Throwable { //keep note: deprecated since j. 9
        System.out.println(garbageCounterFinalize++); //18773
        System.out.println("Объект Cat уничтожен!");
    }
}

/*
In Java 9, the method java.lang.Object.finalize()  is deprecated,
 and it's not recommended to use it for cleaning up resources.
 Instead, it's recommended to use try-with-resources statement or the java.lang.AutoCloseable
  interface to release resources when they are no longer needed.
   The garbage collector in Java will handle removing the objects from memory automatically
    when they are no longer reachable.
 */