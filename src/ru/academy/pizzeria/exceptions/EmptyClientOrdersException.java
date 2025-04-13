package ru.academy.pizzeria.exceptions;

public class EmptyClientOrdersException extends Throwable {
    public EmptyClientOrdersException() {

        super("Список заказов пуст");

    }
}
