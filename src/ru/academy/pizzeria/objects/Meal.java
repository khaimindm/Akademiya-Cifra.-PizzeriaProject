package ru.academy.pizzeria.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.academy.pizzeria.exceptions.PriceException;


// Базовый класс всех блюд. Имеет возможность дельнейшего добавления других кухонь в меню
public abstract class Meal implements ICooking {

    private static final Logger log = LogManager.getLogger(Meal.class);

    protected final String mealName;

    protected int price;

    public Meal(String mealName_, int price_) throws PriceException {

        log.trace("Создаем новое блюдо с названием {}, ценой {}", mealName_, price_);
        this.mealName = mealName_;

        log.debug("Проверяем значение цены");
        if (price_ < 0 || price_ > 10000) {
            throw new PriceException(price_);
        } else {
            this.price = price_;
        }
    }

    public String getMealName() {
        return mealName;
    }

    public int getPrice() {
        return price;
    }

}
