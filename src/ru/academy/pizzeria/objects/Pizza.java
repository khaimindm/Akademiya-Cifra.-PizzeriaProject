package ru.academy.pizzeria.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.academy.pizzeria.exceptions.PriceException;
import ru.academy.pizzeria.exceptions.SizeException;

// Общий класс для всех пицц
public abstract class Pizza extends Meal {

    private static final Logger log = LogManager.getLogger(Pizza.class);
    protected final int size; // Размер пиццы. small - 1, medium - 2, large -3

    public Pizza(String mealName_, int price_, int size_) throws PriceException, SizeException {
        super(mealName_, price_);

        log.debug("Проверяем значение размера пиццы");
        if (size_ != 1 && size_ != 2 && size_ != 3) {
            throw new SizeException(size_);
        } else {
            this.size = size_;
        }
    }
}
