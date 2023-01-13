package com.javarush.task.jdk13.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Улица и дома
*/

//ВЕРНУТЬСЯ ПОЗЖЕ. ЛЯМБЫ И СТРИМЫ = наше все!

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] houses = new int[15];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
/*        for (int i = 0; i < houses.length; i++) {
            houses[i] = Integer.parseInt(bufferedReader.readLine());
        }*/
        for (int i = 0; i < houses.length; i++) {
            houses[i] = (i + 1) * 10;
        }
        long numberOfPeopleInEvenHouses = 0;
        long numberOfPeopleInOddHouses = 0;
        //simple decission
        //System.out.println("Arrays.toString(houses) BEFORE FILTER " + Arrays.toString(houses));
        /*Stream<Integer> integerStream = IntStream.range(0, houses.length).filter(i -> i % 2 == 0)
                .mapToObj(index -> houses[index]);
        numberOfPeopleInEvenHouses = integerStream.mapToInt(Integer::valueOf).sum();*/
        /*numberOfPeopleInEvenHouses = IntStream.range(0, houses.length).filter(i -> i % 2 == 0)
                .map(index -> houses[index]).sum();*/
        /*IntStream intStream = IntStream.range(0, houses.length).filter(i -> i % 2 == 0)
                .map(index -> houses[index]);*/
        /*int sum = intStream.sum();

        System.out.println(sum);*/

        //simple experiments
/*        IntStream intStream = IntStream.range(0, houses.length).filter(i -> i % 2 == 0);
        System.out.println("stream is");
        intStream.forEach(System.out::println);

        int[] ints = IntStream.range(0, houses.length).filter(i -> i % 2 == 0).toArray();
        System.out.println("array of indexes");
        System.out.println(Arrays.toString(ints));

        System.out.println("intStreamWithChangedIndex");
        IntStream.range(0, houses.length).filter(i -> i % 2 == 0).map(x -> x + 1).forEach(System.out::println);

        System.out.println("remade Stream from indexes");
        IntStream.range(0, houses.length).filter(i -> i % 2 == 0).map(house -> houses[house]).forEach(System.out::println);

        System.out.println("boxed?");
        IntStream.range(0, houses.length).boxed().forEach(System.out::println);

        Map<Boolean, List<Integer>> collectedMap = IntStream.range(0, houses.length)
                .boxed()
                .collect(Collectors.groupingBy(i -> i % 2 == 0));
        System.out.println("trying to get map value, key etc");
        for (Map.Entry<Boolean, List<Integer>> entry : collectedMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue().get(0));
        }*/

        //advanced
/*        Map<Boolean, Integer> sumsMap = IntStream.range(0, houses.length)
                .boxed()
                .collect(Collectors.groupingBy(i -> i % 2 == 0, Collectors.summingInt(i -> houses[i])));
        System.out.println("trying to get map value, key etc");
        for (Map.Entry<Boolean, Integer> entry : sumsMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        if (!Objects.equals(sumsMap.get(true), sumsMap.get(false))) {
            System.out.println(sumsMap.get(true) > sumsMap.get(false)
                    ? "В домах с четными номерами проживает больше жителей." : "В домах с нечетными номерами проживает больше жителей.");
        }*/

        //лучше всего
/*        boolean isEvenGreater = IntStream.range(0, houses.length)
                .boxed()
                .collect(Collectors.groupingBy(i -> i % 2 == 0, Collectors.summingInt(i -> houses[i])))
                .entrySet().stream()
                .max(Comparator.comparingInt(Map.Entry::getValue)).orElseThrow()
                .getKey();

        System.out.println("huh ? " + isEvenGreater);*/

   /*     boolean isEvenGreater = IntStream.range(0, houses.length)
                .boxed()
                .collect(Collectors.groupingBy(i -> i % 2 == 0, Collectors.summingInt(i -> houses[i])))
                .entrySet().stream()
                .max(Comparator.comparingInt(Map.Entry::getValue)).orElseThrow()
                .getKey();*/

        System.out.println("smth");
        System.out.println(numberOfPeopleInEvenHouses);
        numberOfPeopleInOddHouses = Arrays.stream(houses).filter(i -> i % 2 != 0).sum();
        System.out.println(numberOfPeopleInOddHouses);

        //решение что принято (там с клавиатура нужно воодить)
/*        for (int i = 0; i < houses.length; i++) {
            if (i % 2 == 0) {
                numberOfPeopleInEvenHouses += houses[i];
            } else {
                numberOfPeopleInOddHouses += houses[i];
            }
        }*/
        if (numberOfPeopleInEvenHouses != numberOfPeopleInOddHouses) {
            System.out.println(numberOfPeopleInEvenHouses > numberOfPeopleInOddHouses
                    ? "В домах с четными номерами проживает больше жителей." : "В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
