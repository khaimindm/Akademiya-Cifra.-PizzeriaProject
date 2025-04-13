package ru.academy.pizzeria.objects;

import ru.academy.pizzeria.exceptions.PriceException;
import ru.academy.pizzeria.exceptions.SizeException;

import java.text.MessageFormat;

// Класс стандартных пицц
public class StandardPizza extends Pizza implements ICooking {

    PizzaSize pizzaSize = new PizzaSize();

    public StandardPizza(String mealName_, int price_, int size_) throws PriceException, SizeException {
        super(mealName_, price_, size_);
    }

    public void cook() {
        System.out.println(MessageFormat.format("Пицца {0} приготовлена. Размер пиццы: {1}.", mealName,
                pizzaSize.convertPizzaSize(size)));
    }
}
