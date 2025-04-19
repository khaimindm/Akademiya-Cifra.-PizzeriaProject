package ru.academy.pizzeria.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.academy.pizzeria.exceptions.PriceException;
import ru.academy.pizzeria.exceptions.SizeException;

// Общий класс для всех пицц
public abstract class Pizza extends Meal implements ICooking {

    private static final Logger log = LogManager.getLogger(Pizza.class);

    AvailablePizzaSizesAndTranslation availablePizzaSizesAndTranslation = new AvailablePizzaSizesAndTranslation();

    protected String pizzaSize; // Размер пиццы
    protected String pizzaSizeTranslation; // Размер пиццы на русском

    public Pizza(String mealName_, int price_, String pizzaSize_) throws PriceException, SizeException {
        super(mealName_, price_);

        // Проверяем имеется ли предоставленное значение размера в Map
        log.debug("Проверяем значение размера пиццы");
        if (!availablePizzaSizesAndTranslation.getAvailablePizzaSizesAndTranslation().containsKey(pizzaSize_)) {
            throw new SizeException(pizzaSize_);
        } else {
            this.pizzaSize = pizzaSize_;
            this.pizzaSizeTranslation = availablePizzaSizesAndTranslation.getAvailablePizzaSizesAndTranslation().
                    get(pizzaSize_);
        }
    }

}
