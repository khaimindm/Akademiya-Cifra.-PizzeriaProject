package ru.academy.pizzeria.exceptions;

// Класс ошибки пустого списка заказов
public class EmptyClientOrdersException extends Throwable {


    public EmptyClientOrdersException() {

        super("Список заказов пуст");

    }
}
