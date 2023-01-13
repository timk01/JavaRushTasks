package com.javarush.task.jdk13.task07.array_remember;

public class ChessBoard {
    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    chessBoard[i][j] = "W" + chessBoardCoord(j, i); //0, 0; 0, 2; 1, 1; ....
                } else {
                    chessBoard[i][j] = "B" + chessBoardCoord(j, i);
                }
            }
        }


        printBoard(chessBoard);
    }

    private static void printBoard(String[][] chessBoard) {
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                System.out.print(" " + chessBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static String chessBoardCoord(int a, int b) {
        String letters = "abcdefgh";
        String numbers = "87654321"; //сверху-вниз: а8 - а7 - а6...
        if ((a > 7) || (b > 7)) return null; //если номер за пределами доски, возвращаем значение по умолчанию - null
        else
            return (Character.toString(letters.charAt(a)) + numbers.charAt(b)); /*charAt - метод, с помощью которого мы извлекаем из строки элемент под переданным номером, здесь - под номерами a и b. Character.toString - метод, который переводит полученный символ в строку*/
    }
}

/*
        W  B  W  B  W  B  W  B
        B  W  B  W  B  W  B  W
        W  B  W  B  W  B  W  B
        B  W  B  W  B  W  B  W
        W  B  W  B  W  B  W  B
        B  W  B  W  B  W  B  W
        W  B  W  B  W  B  W  B
        B  W  B  W  B  W  B  W
                */

/*

    Wa8  Bb8  Wc8  Bd8  We8  Bf8  Wg8  Bh8
    Ba7  Wb7  Bc7  Wd7  Be7  Wf7  Bg7  Wh7
    Wa6  Bb6  Wc6  Bd6  We6  Bf6  Wg6  Bh6
    Ba5  Wb5  Bc5  Wd5  Be5  Wf5  Bg5  Wh5
    Wa4  Bb4  Wc4  Bd4  We4  Bf4  Wg4  Bh4
    Ba3  Wb3  Bc3  Wd3  Be3  Wf3  Bg3  Wh3
    Wa2  Bb2  Wc2  Bd2  We2  Bf2  Wg2  Bh2
    Ba1  Wb1  Bc1  Wd1  Be1  Wf1  Bg1  Wh1
*/

