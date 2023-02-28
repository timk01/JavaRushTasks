package com.javarush.task.jdk13.task08.addons.sber2;

public class Browsers {
    static class Browser {
        public void go() {
            System.out.println("inside browser");
        }
    }

    static class FireFox extends Browser {
        public void go() {
            System.out.println("inside FF");
        }
    }

    static class IE extends Browser {
        @Override
        public void go() {
            System.out.println("inside IE");
        }
    }

    public static void main(String[] args) {
        Browser b = new FireFox();
        IE e = (IE) b;
        e.go();
    }
}

//RTE

/*
Exception in thread "main" java.lang.ClassCastException:
class com.javarush.task.jdk13.task08.addons.sber2.Browsers$FireFox
cannot be cast to class com.javarush.task.jdk13.task08.addons.sber2.Browsers$IE
 */
