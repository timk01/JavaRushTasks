package com.javarush.task.jdk13.task02.addon;

public class BooleanSize {
    public static void main(String[] args) {
        //https://zaleslaw.gitbooks.io/selected-chapters-of-java/content/kishochki-jvm/taini-boolean.html
        //хитро...
        //https://stackoverflow.com/questions/5585919/creating-unicode-character-from-its-number

        //не очевидно совсем.
        //т.е. jvm-определено.  
        /*
        Согласно официальному туториалу от Sun/Oracle мы видим следующую картину для народных масс:
        boolean представляет 1 бит информации, но размер остается на совести того, кто воплощает спеку JVM.
         */

        //с другой стороны, в спецификации...
        /*
        Т.е. нам ясно говорят, что в целом boolean внутренне - это типичный 4-байтовый int. Соответственно,
        переменная типа boolean, скорее всего будет занимать 4 байта (в 32 раза больше, чем само значение, которое она презентует).
         */

        //в массивах - получше
        /*
        n Oracle’s Java Virtual Machine implementation,
        boolean arrays in the Java programming language are encoded as Java Virtual Machine byte arrays, using 8 bits per boolean element.
         */

        //тогда как Boolean = 2 байта.

        //
        /*
TL;DR The only thing that's sure is that boolean occupies at least one bit. Everything else depends on the JVM implementation.

The Java Language Specification doesn't define sizes, only value ranges (see The Language Spec).
 So, it's not only the boolean size that's undefined at this level. And boolean has two possible values: false and true.

The Virtual Machine Specification tells us that boolean variables are treated like int with values 0 and 1.
 Only arrays of boolean have specific support. So at the Virtual Machine level,
  a boolean variable occupies the same amount of space as an int, meaning one stack cell:
   at least 4 bytes, typically 4 bytes on 32-bit Java and 8 bytes on 64-bit.
         */

        //https://community.oracle.com/tech/developers/discussion/2550321/whats-the-size-of-a-java-boolean-type-in-memory

        // https://softwareengineering.stackexchange.com/questions/363286/boolean-size-not-defined-in-java-why
    }
}
