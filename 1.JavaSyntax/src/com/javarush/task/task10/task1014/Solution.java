package com.javarush.task.task10.task1014;

/* 
Расставьте минимум static-ов
*/

public class Solution {
    public int A = 5;
    public static int B = 5;
    public static int C = 5;
    public static int D = 5;

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.A = 5;
        solution.B = 5 * B; //should be Solution.B
        solution.C = 5 * C * D;
        Solution.D = 5 * D * C;

        Solution.D = 5;
    }

    public int getA() {
        return A;
    }

}

// solution.B = 5 * B; //should be Solution.B
//should be static because we use B (so it's Solution.B actually), in this case soultion.B is wrong
//same with solution.C = 5 * C * D;