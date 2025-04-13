package ru.academy.pizzeria.exceptions;

public class MaxNumberOfOrdersForKitchenException extends Throwable {
    public MaxNumberOfOrdersForKitchenException(int size) {

        super("Превышено максимальное количество заказов для кухни. Количество заказов: " + size);

    }

}
