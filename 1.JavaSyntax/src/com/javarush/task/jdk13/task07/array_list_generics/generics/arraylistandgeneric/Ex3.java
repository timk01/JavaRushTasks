package com.javarush.task.jdk13.task07.array_list_generics.generics.arraylistandgeneric;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex3 { //odd, even elems
    public static void main(String[] args) throws IOException {

        //статическая инициализация массива
        int[] data = {1, 5, 6, 11, 3, 15, 7, 8};

        //создание списка, где все элементы должны быть типа Integer
        List<Integer> list = new ArrayList<Integer>();

        //заполнение списка из массива
        for (int i = 0; i < data.length; i++) list.add(data[i]);

        ArrayList<Integer> even = new ArrayList<Integer>();  //чётные
        ArrayList<Integer> odd = new ArrayList<Integer>();    //нечётные

        List<Integer> collectEven = list.stream().filter(x -> x % 2 == 0).mapToInt(x -> x).boxed().collect(Collectors.toList());
        System.out.println(collectEven);
        List<Integer> collectOdd = list.stream().filter(x -> x % 2 != 0).mapToInt(x -> x).boxed().collect(Collectors.toList());
        System.out.println(collectOdd);

        /*for (int i = 0; i < list.size(); i++) {
            Integer x = list.get(i);
            if (x % 2 == 0)    //если x - чётное
                even.add(x);   // добавляем x в коллекцию четных чисел
            else
                odd.add(x);    // добавляем x в коллекцию нечетных чисел
        }*/
    }
}
