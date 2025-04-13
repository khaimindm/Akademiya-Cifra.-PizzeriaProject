package ru.academy.pizzeria.exceptions;

import java.text.MessageFormat;

public class MaxCapacityException extends Throwable {
    public MaxCapacityException(int maxCapacity) {
        super(MessageFormat.format("Некорректное значение максимального объема всех заказов {0}", maxCapacity));
    }
}
