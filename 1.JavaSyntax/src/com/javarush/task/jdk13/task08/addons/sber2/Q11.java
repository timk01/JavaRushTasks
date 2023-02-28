package com.javarush.task.jdk13.task08.addons.sber2;

import java.util.ArrayList;
import java.util.List;

public class Q11 {
    public static void main(String[] args) {
        List<?> nums = new ArrayList<Number>(List.of(1, 2.2, 3));
        for (Object num : nums) {
            System.out.println(num);
        }
    }
}

//Какие варианты создания коллекций верны?
//List<? extends Number> nums = new ArrayList<Integer>();
//ЛЕГАЛЬНО, интеджер потомом намбера
//но есть БОЛЬШИЕ нюансы...

//https://stackoverflow.com/questions/2776975/how-can-i-add-to-list-extends-number-data-structures

//т.е. ГЕТ нормально будет...а сет - нет :) (при этом популейт надо делать сразу, да, потому что вручную добавить в генерик нельзя)
/*
List<? extends Number> nums = new ArrayList<Integer>(List.of(1, 2, 3));
        for (Number num : nums) {
            System.out.println(num);
        }
 */

//сравни с этим, где добавление- легально, но нелегален например перебор.
/*
        List<? super Number> nums = new ArrayList<Number>(List.of(1, 2, 3));
        nums.add(1);
        for (Number num : nums) {
            System.out.println(num);
        }
 */

//а это -
//ЛЕГАЛЬНО (но учти, что ? это сырой тип и обжект)
/*
        List<?> nums = new ArrayList<Number>(List.of(1, 2.2, 3));
        for (Object num : nums) {
            System.out.println(num);
        }
 */

//        List<? extends Integer> nums = new ArrayList<Number>();
//нет, потому что обратное неверно
//        List<Number> nums = new ArrayList<Number>();
//валидно (намберы и под ним)
//nums.add(1.0);
//        nums.add(1);
//        nums.add("sdfds") - нет
