package ru.academy.pizzeria.objects;

import ru.academy.pizzeria.exceptions.PriceException;
import ru.academy.pizzeria.exceptions.SizeException;
import ru.academy.pizzeria.exceptions.TranslationException;

import java.text.MessageFormat;

// Класс сладких пицц
public class SweetPizza extends Pizza implements ICooking {

    TranslatingPizzaSize translatingPizzaSize = new TranslatingPizzaSize();

    public SweetPizza(String mealName_, int price_, String pizzaSize_) throws PriceException,
            SizeException {

        super(mealName_, price_, pizzaSize_);

    }

    @Override
    public void cook() throws TranslationException {
        System.out.println(MessageFormat.format("Пицца {0} приготовлена. Размер пиццы: {1}. Сладкая пицца",
                mealName, translatingPizzaSize.getTranslation(pizzaSize)));
    }

}
