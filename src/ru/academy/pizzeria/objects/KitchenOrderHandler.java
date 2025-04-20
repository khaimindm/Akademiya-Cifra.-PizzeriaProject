package ru.academy.pizzeria.objects;

import ru.academy.pizzeria.exceptions.MaxNumberOfOrdersForKitchenException;
import ru.academy.pizzeria.exceptions.TranslationException;

import java.util.List;

// Класс обработки заказов кухни
public class KitchenOrderHandler extends KitchenOrders {

    // Добавляем заказ клиента ко всем заказам для кухни
    public void addToOrders(List<Meal> clientOrders) throws MaxNumberOfOrdersForKitchenException, TranslationException {

        allOrders.addAll(clientOrders);

        // Проверяем на максимальное количество заказов для кухни
        if (allOrders.size() > 100) {
            throw new MaxNumberOfOrdersForKitchenException(allOrders.size());
        }

        // Приготовление заказа
        for (Meal meal : allOrders) {
            meal.cook();
        }

        allOrders.clear(); // Очищаем список после приготовления

    }
}
