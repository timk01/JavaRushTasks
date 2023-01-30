package com.javarush.task.jdk13.task05.addons;

/*
Твоя задача — спроектировать класс Artifact.

Артефакты, которые хранятся в музее, бывают трех видов.

Первый — о которых неизвестно ничего, кроме порядкового номера, присвоенному музеем (например: 212121).
Второй — о которых известен порядковый номер и культура, которой он был создан (например: 212121, "Ацтеки").
Третий вид — о которых известен порядковый номер, культура, которой он был создан,
и точный век его создания (например: 212121, "Ацтеки", 12).

Создай класс Artifact, описывающий хранящиеся в музее древности,
и напиши необходимое количество конструкторов для него. В методе main() создай по одному артефакту каждого вида.
 */

public class TaskOneArtefact {
    private long artNumber;
    private String culture;
    private int ageOfCreation;

    public TaskOneArtefact(long artNumber) {
        this.artNumber = artNumber;
    }

    public TaskOneArtefact(long artNumber, String culture) {
        this.artNumber = artNumber;
        this.culture = culture;
    }

    public TaskOneArtefact(long artNumber, String culture, int ageOfCreation) {
        this.artNumber = artNumber;
        this.culture = culture;
        this.ageOfCreation = ageOfCreation;
    }

    public static void main(String[] args) {
        TaskOneArtefact artOne = new TaskOneArtefact(1233300);
        TaskOneArtefact artTwo = new TaskOneArtefact(1233300, "Aztec");
        TaskOneArtefact artThree = new TaskOneArtefact(1233300, "Maya", 12);

    }
}
