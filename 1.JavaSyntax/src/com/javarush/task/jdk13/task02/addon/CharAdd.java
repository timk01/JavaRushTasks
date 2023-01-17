package com.javarush.task.jdk13.task02.addon;

public class CharAdd {
    public static void main(String[] args) {
        char c = '!';
        char z = 'z';
        char i = '8';
        System.out.println(c);
        System.out.println(z);
        System.out.println(i);

        System.out.println((char) 56); //это как ни странно 8 (so called ASCII code of char '8' is 56)
        int x = 56;
        char intCh = (char) 56;
        System.out.println(intCh); //8

        char a = '\u0061';
        System.out.println(a); //a
        //see: https://www.section.io/engineering-education/storing-unicode-characters-using-character-literals-in-java/
        //unicode table: https://unicode-table.com/en/#0061


        int intNumber = 65535;

        char charFromNumber = (char) intNumber;
        System.out.println("charFromNumber " + charFromNumber); //￿ (keep in mind that char is 0 -- 65535)

        System.out.println((char) 2000000); //overflow: 2000000%65535 = 33950 //33950 - это 蒀 иероглиф


        char charOfOne = '1';

        int intOfOne = 1;

        System.out.println(i + c); //тут сложение. char 1 преобразовывается в инт (чтобы сложить), а 1 чара соответствует инт = 49
        //49+1 = 50


        char chinesseRandomChar = '耰'; //32816
        int someIntToMinusFromChar = 200;

        System.out.println(chinesseRandomChar - someIntToMinusFromChar); //32616
        System.out.println((char) (chinesseRandomChar - someIntToMinusFromChar)); //罨
        System.out.println((char) chinesseRandomChar - someIntToMinusFromChar); //32616 снова. почему ?
        //первый символ (который чар) преобразуется... к чару - потому не нужно. но потом, нужно дже отнять инт.
        //а как отнять инт ? да, преобразовать обратно из чара в инт и выполнить операцию... на уровне интов.

    }
}
