package ru.academy.pizzeria.objects;

// Общий класс клиентов
public class Client {
    protected final String nameOfTheClient;

    public Client(String nameOfTheClient_) {
        this.nameOfTheClient = nameOfTheClient_;
    }

    public String getNameOfTheClient() {
        return nameOfTheClient;
    }
}
