package ru.academy.pizzeria.exceptions;

// Класс ошибки значения размера пиццы
public class SizeException extends Throwable {
    public SizeException(String size) {

        super("Некорректное значение размера пиццы " + size);

    }
}
