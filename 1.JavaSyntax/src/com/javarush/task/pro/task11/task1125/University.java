package com.javarush.task.pro.task11.task1125;

/* 
Составляем список студентов
*/

public class University {
    private final String[] students = new String[30];

    {
        students[0] = "asdasd";
        students[1] = "sadasdas";
        students[3] = "sadasdas";
        students[9] = "123";
    }

    public void addStudent(String student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

    public void printStudents() {
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
    }
}
