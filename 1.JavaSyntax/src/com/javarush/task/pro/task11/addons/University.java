package com.javarush.task.pro.task11.addons;

/* 
Составляем список студентов
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class University {
    private final String[] students = new String[30];
    private static String[] students2 = new String[30];

    {
        students[0] = "asdasd";
        students[1] = "sadasdas";
        students[3] = "sadasdas";
        students[9] = "123";
    }

    {
        students2[0] = "asdasd";
        students2[1] = "sadasdas";
        students2[3] = "sadasdas";
        students2[9] = "123";
    }

    public void addStudent(String student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

    //работает, занося студентов ПОСЛЕ, вне зависимости есть фильтр или нет...
    //но подумать есть над чем
    public void addStudent2(String student) {
        Stream<String> stringStream = Arrays.stream(students2)/*.filter(Objects::nonNull)*/;
        //List<String> collect1 = stringStream.collect(Collectors.toList());
/*        System.out.println("after stream filtering:");
        collect1.stream().forEach(System.out::println);
        System.out.println("end of print");*/
        List<String> collect = Stream.concat(stringStream, Stream.of(student)).collect(Collectors.toList());
        students2 = collect.toArray(new String[0]);
    }

    public void printStudents() {
        for (String student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    public void printStudents(String[] students) {
        for (String student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        University university = new University();
        university.addStudent("Максим Федоренко");
        university.addStudent("Олег Кесарчук");
        university.printStudents();

        System.out.println("абыр\n");

        university.addStudent2("Максим Федоренко");
        university.addStudent2("Олег Кесарчук");
        university.printStudents(students2);
    }
}
