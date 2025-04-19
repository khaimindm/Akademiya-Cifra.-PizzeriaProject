package ru.academy.pizzeria.objects;

import ru.academy.pizzeria.exceptions.PriceException;
import ru.academy.pizzeria.exceptions.SizeException;

import java.text.MessageFormat;

// Класс сладких пицц
public class SweetPizza extends Pizza implements ICooking {

    private final boolean isSweet;

    public SweetPizza(String mealName_, int price_, String pizzaSize_, boolean isSweet) throws PriceException,
            SizeException {
        super(mealName_, price_, pizzaSize_);
        this.isSweet = isSweet;
    }

    @Override
    public void cook() {
        System.out.println(MessageFormat.format("Пицца {0} приготовлена. Размер пиццы: {1}. Сладкая пицца",
                mealName, pizzaSizeTranslation));
    }

}
