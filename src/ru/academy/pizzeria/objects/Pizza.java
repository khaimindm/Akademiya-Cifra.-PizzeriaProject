package ru.academy.pizzeria.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.academy.pizzeria.exceptions.PriceException;
import ru.academy.pizzeria.exceptions.SizeException;

// Общий класс для всех пицц
public abstract class Pizza extends Meal implements ICooking {

    private static final Logger log = LogManager.getLogger(Pizza.class);

    AvailablePizzaSizes availablePizzaSizes = new AvailablePizzaSizes();

    protected String pizzaSize; // Размер пиццы

    public Pizza(String mealName_, int price_, String pizzaSize_) throws PriceException, SizeException {
        super(mealName_, price_);

        // Проверяем имеется ли предоставленное значение размера в наборе допустимых размеров
        log.debug("Проверяем значение размера пиццы");
        if (!availablePizzaSizes.getAvailablePizzaSizes().contains(pizzaSize_)) {
            throw new SizeException(pizzaSize_);
        } else {
            this.pizzaSize = pizzaSize_;
        }
    }

}
