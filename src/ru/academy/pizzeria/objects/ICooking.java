package ru.academy.pizzeria.objects;

import ru.academy.pizzeria.exceptions.TranslationException;

public interface ICooking {
    void cook() throws TranslationException;
}
