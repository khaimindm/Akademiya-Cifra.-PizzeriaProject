package ru.academy.pizzeria.objects;

import ru.academy.pizzeria.exceptions.MaxNumberOfOrdersForKitchenException;

import java.util.LinkedList;
import java.util.List;

// Класс кухня, который обрабатывает все заказы
public class Kitchen {

    List<Meal> allOrders = new LinkedList<>(); // Все заказы для кухни

    // Добавляем заказ клиента ко всем заказам для кухни
    public void addToOrders(List<Meal> clientOrders) throws MaxNumberOfOrdersForKitchenException {

        allOrders.addAll(clientOrders);

        // Проверяем на максимальное количество заказов для кухни
        if (allOrders.size() > 100) {
            throw new MaxNumberOfOrdersForKitchenException(allOrders.size());
        }

        for (Meal meal : allOrders) {
            meal.cook();
        }

        allOrders.clear(); // Очищаем список после приготовления

    }

}
