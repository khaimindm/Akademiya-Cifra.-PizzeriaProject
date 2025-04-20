package ru.academy.pizzeria.exceptions;

// Класс ошибки перевода значения размера пиццы с английского на русский
public class TranslationException extends Throwable {

    public TranslationException(String sizeInEnglish) {

        super("Значение размера пиццы не найдено в отображении. Значение: " + sizeInEnglish);

    }
}
