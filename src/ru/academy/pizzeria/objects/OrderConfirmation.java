package ru.academy.pizzeria.objects;

import ru.academy.pizzeria.exceptions.EmptyClientOrdersException;

import java.text.MessageFormat;
import java.util.List;
import java.util.Scanner;

// Класс подтверждения заказа
public class OrderConfirmation {

    Scanner console = new Scanner(System.in);

    // Показываем клиенту данные заказа и запрашиваем подтверждение
    public boolean confirm(List<Meal> clientOrders, String nameOfTheClient) throws EmptyClientOrdersException {

        if (clientOrders.isEmpty()) {
            throw new EmptyClientOrdersException();
        }

        int totalCost = 0;
        boolean decision = false;
        int orderNumber = 0;
        System.out.println();
        System.out.println("Клиент: " + nameOfTheClient);
        System.out.println("Состав заказа: ");

        for (Meal meal : clientOrders) {
            orderNumber++;
            System.out.println(MessageFormat.format("{0}. {1}. Цена: {2}р.", orderNumber, meal.getMealName(),
                    meal.getPrice()));
            totalCost += meal.getPrice();
        }

        orderNumber = 0;

        System.out.println(MessageFormat.format("Общая стоимость заказа: {0}р.", totalCost));
        System.out.println("Вы подтверждаете заказ?");
        System.out.println("Введите: Да / Нет");

        String answer = console.nextLine();

        if (answer.equals("Да")) {
            System.out.println("Заказ подтвержден");
            System.out.println();
            decision = true;
        } else {
            System.out.println("Заказ не подтвержден. Вы можете создать заказ снова.");
        }

        return decision;
    }
}
