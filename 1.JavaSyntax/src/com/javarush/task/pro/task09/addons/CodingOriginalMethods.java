package com.javarush.task.pro.task09.addons;

public class CodingOriginalMethods {
    public static void main(String[] args) {
        /*
        3. Методы Integer.toBinaryString(int) и Long.toBinaryString(int) использовать нельзя.
4. Методы Integer.toHexString(int) и Long.toHexString(int) использовать нельзя.
5. Методы Integer.parseInt(String, int) и Long.parseLong(String, int) использовать нельзя.
6. Методы Integer.toString(int, int) и Long.toString(long, int) использовать нельзя.
         */
        System.out.println(Integer.toBinaryString(100)); //100 --> 1100100
        System.out.println(Long.toBinaryString(100));

        System.out.println(Integer.toHexString(234)); //ea
        System.out.println(Long.toHexString(12)); //c
        System.out.println(Long.toHexString(9)); //9
        //https://www.geeksforgeeks.org/java-lang-integer-tohexstring-method-examples/

        //Integer.parseInt(String, int)
        /*
        This method returns the integer value which is represented by the string argument in the specified radix.
         */
        int a = Integer.parseInt("150", 8); //104 (OCTAL(8) TO DECIMAL(10))
        int b = Integer.parseInt("+200", 16); //512 (+200(16) -> 512(10)
        int c = Integer.parseInt("-344", 12); //-484
        int d = Integer.parseInt("1100110", 2); //102 (BINARY(2) TO DECIMAL(10))
        System.out.println("Value = " + a);
        System.out.println("Value = " + b);
        System.out.println("Value = " + c);

        //Integer.toString( int,int)
        //Returns a string representation of the specified integer with radix 10
        String returnval1 = Integer.toString(65, 10);
        System.out.println("String Value = " + returnval1); //65
        //Returns a string representation of the specified integer with radix 16
        String returnval2 = Integer.toString(65, 16);
        System.out.println("String Value = " + returnval2); //41 (DECIMAL TO HEXADECIMAL)
        //Returns a string representation of the specified integer with radix 8
        String returnval3 = Integer.toString(65, 8);
        System.out.println("String Value = " + returnval3); //101 (DECIMAL TO OCTAL)
        //Returns a string representation of the specified integer with radix 2
        String returnval4 = Integer.toString(65, 2);
        System.out.println("String Value = " + returnval4); //1000001 (DECIMAL TO BINARY)
    }
}
