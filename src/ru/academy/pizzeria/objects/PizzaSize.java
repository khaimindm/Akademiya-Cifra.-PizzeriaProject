package ru.academy.pizzeria.objects;

// Класс для получения текстового вида размера пиццы
public class PizzaSize {

    protected String size;

    public String convertPizzaSize (int size_) {
        switch (size_) {
            case 1 : size = "маленькая";  // маленькая пицца
                break;
            case 2 : size = "средняя"; // средняя пицца
                break;
            case 3 : size = "большая"; // большая пицца
                break;
            default: size = "средняя";
            break;
        }
        return size;
    }
}
