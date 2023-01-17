package com.javarush.task.jdk13.task08.task0831;

import java.util.Arrays;

/* 
Любимые настолки
*/

public class Solution {

    public static BoardGame[] collection = new BoardGame[5];

    public static void main(String[] args) {
        BoardGame chess = new BoardGame();
        chess.name = "Шахматы";
        collection[0] = chess;

        BoardGame go = new BoardGame();
        go.name = "Го";
        collection[1] = go;

        BoardGame monopoliya = new BoardGame();
        monopoliya.name = "Монополия";
        collection[2] = monopoliya;

        BoardGame MTG = new BoardGame();
        MTG.name = "Magic: The Gathering";
        collection[3] = MTG;

        BoardGame lotto = new BoardGame();
        lotto.name = "Лотто";
        collection[4] = lotto;

        System.out.println(Arrays.toString(collection));
    }
}