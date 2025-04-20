package ru.academy.pizzeria.objects;

import ru.academy.pizzeria.exceptions.TranslationException;

// Класс вывода содержимого меню
public class MenuOutputHandler extends Menu {

    AvailablePizzaSizes availablePizzaSizes = new AvailablePizzaSizes();
    TranslatingPizzaSize translatingPizzaSize = new TranslatingPizzaSize();

    public void showTheMenu() throws TranslationException {
        StringBuilder stringBuilder = new StringBuilder();

        // Собираем все доступные размеры пицц в строку
        for (String size : availablePizzaSizes.getAvailablePizzaSizes()) {
            stringBuilder.append(translatingPizzaSize.getTranslation(size));
            stringBuilder.append(" ");
        }

        int orderNumber = 0;
        System.out.println();
        System.out.println("Меню");

        for (Meal meal : menu) {
            orderNumber++;
            System.out.println(orderNumber + ". " + meal.getMealName() + ". Цена: " + meal.getPrice() + "р.");
            if (meal instanceof Pizza) {
                System.out.println("Доступные размеры пиццы: " + stringBuilder);
                System.out.println();
            }
        }

    }
}
