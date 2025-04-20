package ru.academy.pizzeria.objects;

// Класс обработки заказов клиента
public class ClientsOrderHandler extends ClientOrder {

    public ClientsOrderHandler(String nameOfTheClient_) {
        super(nameOfTheClient_);
    }

    public void addProduct(Meal meal) {
        clientOrders.add(meal);
    }

}
