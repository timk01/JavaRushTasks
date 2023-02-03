package com.javarush.task.jdk13.task07.array_list_generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamsArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        //fill:
        //v lob:
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }

        //https://www.tutorialspoint.com/Conversion-of-Array-To-ArrayList-in-Java
        //using addAll, of
        /*list.addAll(Arrays.asList(1, 2, 3, 4, 5));
        list = List.of(1, 2, 3);
        Collections.addAll(list, 123, 123);
        OR
        Collections.addAll(list, array); //whole array
        */

        //how to print: (besides loop fori...)
        list.stream().forEach(System.out::println);
        System.out.println();

        //how to find Max

        //0. самое простое - через коллекшнс
/*        Integer max = Collections.max(list);

        Collections.sort(list);
        list.get(list.size() - 1);*/

        //1. sort (in one order or another and the last (min) element is max)
/*        list.sort(Comparator.naturalOrder());
        System.out.println("max is: " + list.get(list.size() - 1));
        list.stream().forEach(System.out::println);*/

        //1.1
        /*list.sort(Comparator.reverseOrder());*/

        //1.3 same, but using streams:
/*        Integer integer = list.stream().max(Comparator.comparing(Integer::valueOf)).get(); //v -> v
        Optional<Integer> max = list.stream().max(Comparator.naturalOrder());*/
        //Optional<Integer> max = list.stream().collect(Collectors.maxBy(Comparator.naturalOrder()));
        //очень похоже

        //1.4 using mapToInt
/*        OptionalInt max = list.stream().mapToInt(Integer::intValue).max();
        if (max.isPresent()) {
            System.out.println(max.getAsInt()); //просто макс выведет оптионал(число)
        }*/
        //mapToInt здесь возврвщает просто стрим из интовых значений

        //1.5 - кстати тема!
//        int max = list.stream().collect(Collectors.summarizingInt(Integer::intValue)).getMax();
        //System.out.println(collect); //IntSummaryStatistics{count=10, sum=449, min=4, average=44,900000, max=75}

        //1.6 using reduce
        //Optional<Integer> max = list.stream().reduce(Integer::max); //Integer::max ---- (a,b) -> Integer.compare(a, b)
        //редьюс, он просто применяет функцию байнериоператора...

        //ВАЖНО:
        //https://www.baeldung.com/java-collection-min-max
        //https://stackoverflow.com/questions/31378324/how-to-find-maximum-value-from-a-integer-using-stream-in-java-8
        //(пост Тагира, например)

    }
}
