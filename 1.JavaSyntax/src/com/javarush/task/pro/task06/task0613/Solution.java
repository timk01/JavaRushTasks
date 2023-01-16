package com.javarush.task.pro.task06.task0613;

/* 
Города-гиганты
*/

public class Solution {
    public static String city = "Токио";
    public String cityNonStatic = "cityNonStatic";
    public static double population = 34.5;

    public static void main(String[] args) {
        printCityPopulation("Джакарта", 25.3);
        printCityPopulation("Сеул", 25.2);
        printCityPopulation("Дели", 23.1);
        printCityPopulation("Нью-Йорк", 21.6);

        new Solution().printCityPopulationNonStatic("Нью-Йорк", 21.6);
    }

    public static void printCityPopulation(String city, double population) {
        System.out.println("Население города " + city + " составляет " + population + " млн человек.");
        System.out.println("В то время как в самом густонаселенном городе " + Solution.city + " население составляет " + Solution.population + " млн человек.");
    }

    public void printCityPopulationNonStatic(String city, double population) {
        System.out.println("Население города " + city + " " + cityNonStatic + " составляет " + population + " млн человек."); //this.city - можно, но плохо
        System.out.println("В то время как в самом густонаселенном городе " + Solution.city + " население составляет " + Solution.population + " млн человек.");
    }
}

//а вот this.city нельзя, т.к. она - объект класса. и доступ к ней из статического метода (статикам - статик)
//сравни с моментом, если бы this.city было полем класса, но НЕ статическим
// но даже при этом из статиеского метода нельзя обращаться к нестатическому полю класса

//а вот наоборот - можно (см. printCityPopulationNonStatic)
//1 - city из НЕСТАТИЧЕСКОГО метода - ок. это параметр метода.
// второе. cityNonStatic - поле класса, но нестатическое. просто по имени класса
// (здесь обращение Solution.cityNonStatic - ошибка и ее не пропустит компилятор, т.к. НЕСАТИЧЕСКЕ поле)
//третье. Solution.city или Solution.population - обращение к статическим полям класса из нестатического метода (через имя класса)
//и наконец, new Solution().printCityPopulationNonStatic("Нью-Йорк", 21.6);


