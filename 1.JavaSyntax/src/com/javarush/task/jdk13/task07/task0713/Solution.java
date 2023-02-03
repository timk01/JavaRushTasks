package com.javarush.task.jdk13.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Три массива
*/

public class Solution {

    public static ArrayList<Integer> numbers = new ArrayList<>();
    public static ArrayList<Integer> divBy3 = new ArrayList<>();
    public static ArrayList<Integer> divBy2 = new ArrayList<>();
    public static ArrayList<Integer> others = new ArrayList<>();
    public static final int TWENTY = 20;

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < TWENTY; i++) {
            numbers.add(Integer.parseInt(bufferedReader.readLine()));
        }
        for (int i = 0; i < numbers.size(); i++) {
            Integer integer = numbers.get(i);
            if (integer % 3 == 0 && integer % 2 == 0) { //или, внимание, на 6 (3*2)
                divBy3.add(integer);
                divBy2.add(integer);
            } else if (integer % 3 == 0) {
                divBy3.add(integer);
            } else if (integer % 2 == 0) {
                divBy2.add(integer);
            } else {
                others.add(integer);
            }
        }
        printList(divBy3);
        printList(divBy2);
        printList(others);
    }

    public static void printList(List<Integer> list) {
        list.stream().forEach(System.out::println);
    }
}

//IMPORTANT: List.of(1, 2, 3); OR Arrays.asList(1, 2, 3) are IMMUTABLE. you cannot fcking remove from it.
//use Collections.addAll(list, 1, 2, 3);

//        //divby31 = IntStream.range(0, numbers.size()).filter(x -> x / 3 == 0).boxed().collect(Collectors.toList());

//так делал я. внезапно, работает.
//        Collections.addAll(numbers, 48, 29, 47, 15, 53, 91, 61, 19, 54, 77, 77, 73, 62, 95, 44, 84, 75, 41, 20, 60);
//тестовые
/*
        /*divBy3 = (ArrayList<Integer>) numbers.stream().filter(x -> x % 2 == 0 && x % 3 == 0).collect(Collectors.toList());
        divBy2 = (ArrayList<Integer>) numbers.stream().filter(x -> x % 2 == 0 && x % 3 == 0).collect(Collectors.toList());
        divBy3 = (ArrayList<Integer>) numbers.stream().filter(x -> x % 3 == 0).collect(Collectors.toList());
        divBy2 = (ArrayList<Integer>) numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        numbers.removeAll(divBy3);
        numbers.removeAll(divBy2);
        others = numbers;*/

//реализация "правильного решения"
//логика: если равняется 3 ИЛИ 2, идем дальше.
//если "соло" 3 - ложи 3
//ежели еще и 2 - ложи 2 (тогда как раз вариант что И 3, И 2 одновременно)
//и наоборот
/*
for (int i = 0; i < 20; i++) {
            int number = numbers.get(i);

            if ((number % 3 == 0) || (number % 2 == 0)) {
                if (number % 3 == 0) {
                    divBy3.add(number);
                }
                if (number % 2 == 0) {
                    divBy2.add(number);
                }
            } else {
                others.add(number);
            }
        }
 */