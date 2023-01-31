package com.javarush.task.pro.task11.task1123;

import java.util.ArrayList;
import java.util.List;

/* 
Почувствуй себя деканом
*/

public class UniversityGroup {
    public List<String> students;

    public UniversityGroup() {
        students = new ArrayList<>();
        students.add("Сергей Фрединский");
        students.add("Виталий Правдивый");
        students.add("Максим Козыменко");
        students.add("Наталия Андрющенко");
        students.add("Ира Величенко");
        students.add("Николай Соболев");
        students.add("Снежана Слободенюк");
    }

    public void exclude(String excludedStudent) {
        students.removeIf(student -> student.equals(excludedStudent));
    }

    public static void main(String[] args) {
        UniversityGroup universityGroup = new UniversityGroup();
        universityGroup.exclude("Виталий Правдивый");
        universityGroup.students.forEach(System.out::println);
    }
}

//students = students.stream().filter(student -> !(student.equals(excludedStudent))).collect(Collectors.toList());

//вариант, т.к. тут нет "пройтись по массиву и что-то сделать", тут есть только "что-то сделать", то и такое пройдет.
/*
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).equals(excludedStudent)) {
                students.remove(i);
            }
        }
 */

//с итератором (но тут снова джава предлагает заменить на ремувИф)
/*
        Iterator<String> iterator = students.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(excludedStudent)) {
                iterator.remove();
            }
        }
 */