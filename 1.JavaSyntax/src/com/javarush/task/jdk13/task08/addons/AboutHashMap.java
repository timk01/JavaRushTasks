package com.javarush.task.jdk13.task08.addons;

public class AboutHashMap {
}

//https://www.youtube.com/watch?v=-oafFAPgLao

////5.43 - если упрощать - остаток отделения (%16)
//10.22 - если быстро вспомнить как оно внутренне работает (добавление элементов)
//11.51: поиск в ЛЛ медленен (О(эн)). -  тут кстати односвязаный список
//12.51 - но, как и в массиве, поиск по элементу в-обще очень быстр - O(1)
//т.е. при хэш-коллизиях оно деградирует, разумеется
//(вплоть если коллизий очень много - но тогда вопрос к хэш-функции)
//https://dzone.com/articles/hashmap-performance
//деградирует до... O(logn) в случае с джава8 и деревьями.
/*
Handle Frequent HashMap Collisions with Balanced Trees:
In the case of high hash collisions, this will improve worst-case performance from O(n) to O(log n).
 */
//14.43: про Жабу8, т.н. treefy_threshold = 8 (min_capacity = 64)
//17.53: и вот где компейрТу играет роль!
//красно-черное дерево, байнери сеарч (дада, тот самый), самобалансирующееся дерево

//про хещкод, екуалс и пр.
//https://www.youtube.com/watch?v=CpVALR9HeTE

//про поиск в ЛЛ читать здесь: (О(Эн))
//https://testbook.com/question-answer/the-time-complexity-of-searching-an-element-in-lin--5eccfbfef60d5d024b9c6cd7


//есть нюанс. ключи должны быть иммутабельны, иначе могут быть проблемы (особенно со сложными объектами своего типа)
//https://www.thetechnojournals.com/2019/10/why-hashmap-key-should-be-immutable-in.html
