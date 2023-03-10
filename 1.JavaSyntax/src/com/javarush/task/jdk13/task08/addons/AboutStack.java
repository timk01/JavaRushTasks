package com.javarush.task.jdk13.task08.addons;

import java.util.Stack;

public class AboutStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("123");
        stack.push("123");
        stack.push("123");
        stack.push("123");
        stack.push("123");
        stack.add(0, "345");
        System.out.println(stack);
        System.out.println(stack.get(1));
    }
}

/*
Стек - как груда бумаги. Элементы кладутся наверх и забираются сверху.
Это т.к. LIFO (ласт-ин-ферст-аут) принцип.

Стек экстендит вектор.

Для стека нужно всего три операции:
Push, Pop и Peek (добавить в конец, удалить + вернуть удаленный, вернуть (без удаления))
Создан на основе массива, отсюда и плюсы

ВАЖНО: стек экстендит вектор (а там есть операции по удалению и добавлению вовнутрь, внезапно)

ВЫВОД: если рассматривать стек как... стек :) (т.е. пуш, поп, пик), то плюсы очевидны. Минусы - это скорее вопрос архитектуры.
добавить и удалить в конец можно быстро (это поп, пуш)
Если же вспомнить, что стек все же наследует ВЕКТОР, то тут уже плюсы и минусы вектора -
получение по произвольному индексу все еще быстрое О(1), а вот добавление и вставка в середину - медленные.
Траверс тоже медленный (перебрать надо элементы один за другим)
 */
