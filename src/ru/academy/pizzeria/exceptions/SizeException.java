package ru.academy.pizzeria.exceptions;

public class SizeException extends Throwable {
    public SizeException(int size) {

        super("Некорректное значение размера пиццы " + size);

    }
}
