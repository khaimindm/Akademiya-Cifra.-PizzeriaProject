package ru.academy.pizzeria.objects;

import ru.academy.pizzeria.exceptions.MaxCapacityException;

import java.util.LinkedList;
import java.util.List;

// Заказы клиента
public class ClientOrders extends Client {

    protected final int maxNumberOfOrders; // максимальное количество заказов

    protected final List<Meal> clientOrders = new LinkedList<>(); // Заказы клиента

    public ClientOrders(String nameOfTheClient_, int maxNumberOfOrders_) {
        super(nameOfTheClient_);
        this.maxNumberOfOrders = maxNumberOfOrders_;
    }

    public void addProduct(Meal meal) throws MaxCapacityException {
        if (clientOrders.size() > maxNumberOfOrders) {
            throw new MaxCapacityException(clientOrders.size());
        }
        clientOrders.add(meal);
    }

    public List<Meal> getClientOrders() {
        return clientOrders;
    }

}
