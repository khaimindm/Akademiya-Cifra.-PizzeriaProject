package ru.academy.pizzeria.objects;

import ru.academy.pizzeria.exceptions.PriceException;
import ru.academy.pizzeria.exceptions.SizeException;

import java.text.MessageFormat;

// Класс вегетарианских пицц
public class VegetarianPizza extends Pizza implements ICooking {

    PizzaSize pizzaSize = new PizzaSize();

    private final boolean isVegetarian;

    public VegetarianPizza(String mealName_, int price_, int size_, boolean isVegetarian_) throws PriceException, SizeException {
        super(mealName_, price_, size_);
        this.isVegetarian = isVegetarian_;
    }

    @Override
    public void cook() {
        System.out.println(MessageFormat.format("Пицца {0} приготовлена. Размер пиццы: {1}. Вегетарианская пицца",
                mealName, pizzaSize.convertPizzaSize(size)));
    }
}
