package com.javarush.task.jdk13.task08.addons;

public class AboutCollections {
    //SET - множество (HashSet, TreeSet или LinkedHashSet, SortedSet): как например... куча обуви в коробке
    //(там, где не по парам, а просто свалены наобум с целью разобраться как-нибудь "потом")
    //порядка нет, элементы уникальны
    /*
    Set data structure is used to store unique values only, meaning no duplicate values would be stored in a set.
     */
    /*
    Добавлять элемент(ы) 	add(), addAll()
    Удалять элемент(ы) 	remove(), removeAll()
    Проверять, есть ли элемент(ы) 	contains(), containsAll()
    +size()
     */

    //LIST - список (АЛ, ЛЛ, Вектор/Стек). та же обувь п определенном порядке
    //порядок есть, элементы не уникальны

    //QUEUE - очередь (PriorityQueue). обувь положена  и забирается первой.
    //Порядок FIFO
    /*
    При добавлении и удалении из очереди первый добавляемый элемент будет первым извлекаемым.
    The remove() and poll() methods remove and return the head of the queue
    Insert - add(e), offer(e)
    Remove - remove(), poll()
    Examine - element(), peek()

    DEQUE (ЛЛ)
    Программистам часто нужно добавлять или удалять элементы из обоих концов очереди.
    Такая структура называется двухсторонней очередью (double ended queue, deque).
    В этом случае добавляется ещё пара операций - с конца

     */


    //MAP - карта (HashMap, TreeMap или LinkedHashMap, HashTable, SortedMap). обувь + уникальное название (или номер, тоже уникальный)
    //т.е. пары ключ-значение (уникален лишь ключ)
    //порядка нет
    /*
    The Map interface doesn't guarantee the order of mappings, however, it depends on the implementation. For instance, HashMap doesn't guarantee the order of mappings but TreeMap does.
     */
    /*
    Получить множество всех пар 	entrySet()
Получить множество всех ключей 	keySet()
Получить множество всех значений 	values()
Добавить пару 	put(key, value)
Получить значение по ключу 	get(key)
Проверить наличие «ключа» 	containsKey(key)
Проверить наличие «значения» 	containsValue(value)
Проверить что Map — пустой 	isEmpty()
Очистить Map 	clear()
Удалить элемент по ключу 	remove(key)
     */

    //https://docs.oracle.com/javase/tutorial/collections/interfaces/collection.html
    //https://habr.com/ru/post/339656/

}
