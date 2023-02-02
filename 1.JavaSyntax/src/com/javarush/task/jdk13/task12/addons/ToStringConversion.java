package com.javarush.task.jdk13.task12.addons;

public class ToStringConversion {
    public static void main(String[] args) {
        //all types you can convert to String (and most time in implicit way)
        String text = 5 + '\u0000' + "Log";
        System.out.println(text);
        //in reality int i2 = 5 + (int) '\u0000'; String text = Integer.toString(i2) + "Log";
        //all operations from elft to right, so first we get sum and then, conversion and concat

        String text2 = "Object is " + (float) 2 / 3;
        //float f2 = ((float) 2) / 3; String text="Object is " + Float.toString(f2);

        //Cat cat = new Cat("Vaska");
        //String text = "My cat is " + cat; //cat.toString()

        //null = "null"; int x = Integer.toString(x)

    }
}
