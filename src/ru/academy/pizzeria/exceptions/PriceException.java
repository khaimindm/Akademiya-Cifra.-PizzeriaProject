package ru.academy.pizzeria.exceptions;

public class PriceException extends Throwable {
    public PriceException(int price) {

        super("Некорректная цена " + price);
    }
}
