package ru.academy.pizzeria.objects;

import java.util.LinkedList;
import java.util.List;

// Заказы клиента
public class ClientOrder extends Client {

    protected final List<Meal> clientOrders = new LinkedList<>(); // Заказы клиента

    public ClientOrder(String nameOfTheClient_) {
        super(nameOfTheClient_);
    }

    public List<Meal> getClientOrders() {
        return clientOrders;
    }

}
