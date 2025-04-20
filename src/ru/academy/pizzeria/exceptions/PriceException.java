package ru.academy.pizzeria.exceptions;

// Класс ошибки цены
public class PriceException extends Throwable {

    public PriceException(int price) {

        super("Некорректная цена " + price);

    }
}
