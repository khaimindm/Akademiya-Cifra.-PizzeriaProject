package ru.academy.pizzeria.objects;

import java.util.LinkedList;

// Класс меню
public class Menu {

    protected String test;

    protected LinkedList<Meal> menu = new LinkedList<>();

    public LinkedList<Meal> getMenu() {
        return menu;
    }
}
