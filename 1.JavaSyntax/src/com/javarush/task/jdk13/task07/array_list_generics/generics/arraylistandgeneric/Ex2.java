package com.javarush.task.jdk13.task07.array_list_generics.generics.arraylistandgeneric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex2 { //delete elem if > 5
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(7);
        list.add(11);
        list.add(3);
        list.add(15);

/*        for (int i = 0; i < list.size(); ) //убрали увеличение i внутрь цикла
        {
            if (list.get(i) > 5)
                list.remove(i);  //не увеличиваем i, если удалили текущий  элемент
            else
                i++;
        }*/

        list = list.stream().filter(i -> i > 5).collect(Collectors.toList());

        System.out.println(list);
    }
}
