package com.javarush.task.pro.task09.addons;

public class NumbersCoding {
    public static void main(String[] args) {
        //8x = 0, 1, 2, .. 7
        //you need to add 0 BEFORE number to represent octa
        int x = 015; //1*8+5=13
        int x2 = 025; //2*8+5=21
        int x3 = 0123; //1*8^2+2*8^1+3*8^0=1*64+2*8+3=83
        //int x4 = 078; //Не скомпилируется: цифры 8 нет в восьмеричной кодировке.
        //long x5 = 078L; //и даже так - нет
        int x6 = 0444; //292: 4*8^2+4*8+4*1
        int x7 = 07777; //4095

        //2x = 0, 1
        //0b BEFORE number
        int x8 = 0b100; //1*2^2 + 0*2^1 + 0*2^0 = 4
        int x9 = 0b1111; //1*2^3 + 1*2^2 + 1*2^1 + 1*2^0 = 8 + 4 + 2 + 1 =15 
        int x10 = 0b1111000111; //1*2*9 + ... = 967
        //int x11 = 0b12000; //cannot compile: 2 isn't in 2 coding

        //16x = 0-9 + A, B, C, D, E, F
        //0X BEFORE number
        int y = 17;
        int yDoubleSystem = 0b00010001; //2^4+2^0
        int yHexSystem = 0x11; //1*16^1 + 1*16^0
        int y2 = 0b00101001; //41 or 8+32+1
        int y2Hex = 0x29; //2*16^1 + 9*16^0 = 32 + 9
        int y3 = 85; //0b01010101 or 0x55
        int y4 = 256; //0b100000000 or 0x100; 
        //0x1 	0b00000001 	1
        //0x9 	0b00001001 	9
        //0xA 	0b00001010 	10 (A)
        //0xF 	0b00001111 	15 (F)
        int y5 = 0x1F; // 	0b00011111 	31 = 1*16^1 + 15*1^0
        int y6 = 0xAF;    //0b10101111 	175 = 10*16^1 + 15
        int y7 = 0xFFF;    //0b111111111111 	4095 = 15*16^2 + 15*16 + 15 = 3840 + 240 + 15

        //0xAFCF = A*16^3 + F*16^2 + C*16^1 + F = 10*4096 + 15*256 + 12*16 + 15 = 45007
        //0xAFCF = 0b1010111111001111 (every 4 bits)
        //A = 10; 1010 = 1*2^4 + 0*2^3 + 1*2^1 + 0*2^0
        //C = 12; 1100 = 8 + 4

    }
}
