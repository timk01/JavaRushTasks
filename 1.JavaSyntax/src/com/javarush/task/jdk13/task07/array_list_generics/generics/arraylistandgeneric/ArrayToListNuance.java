package com.javarush.task.jdk13.task07.array_list_generics.generics.arraylistandgeneric;

public class ArrayToListNuance {
    /*        int[] smth = {1, 2, 3};
    List<Integer> list = new ArrayList<Integer>(Arrays.asList(smth)); */
    //cannot with int[], but can with Integer[]

        /*int[] smth = {1, 2, 3};
        List<Integer> integers = Arrays.asList(smth);*/
    //cannot with primitives

    // , but can with objects:
/*        String[] arr = {"apple", "banana", "cherry"};
        List<String> list = Arrays.asList(arr);*/

    //а так - можно объекты!
/*        Integer[] smth = {1, 2, 3};
        List<Integer> integers = Arrays.asList(smth);
        System.out.println(integers);*/

    //тоже ок
/*        Integer[] smth = {1, 2, 3};
        List<Integer> integers = new ArrayList<>();
        Collections.addAll(integers, smth);
        System.out.println(integers);*/

    //вариант 2
/*        Integer[] smth = {1, 2, 3};
        List<Integer> integers = new ArrayList<>();
        integers.addAll(Arrays.asList(smth));
        System.out.println(integers);*/

    //единственное, что работает напрямую
/*        int[] smth = {1, 2, 3};
        List<Integer> list = Arrays.stream(smth).boxed().collect(Collectors.toList());
        //Returns a Stream consisting of the elements of this stream, each boxed to an Integer.
        System.out.println(list);*/

    //или так
    /*for (int i : array) {
            que.add(i);
            }*/

}
