package ru.academy.pizzeria.objects;

import java.util.HashMap;
import java.util.Map;

// Класс с набором допустимых размеров пицц
public class AvailablePizzaSizesAndTranslation {

    protected Map<String, String> availablePizzaSizesAndTranslation;

    public AvailablePizzaSizesAndTranslation() {
        this.availablePizzaSizesAndTranslation = new HashMap<>();

        this.availablePizzaSizesAndTranslation.put("small", "маленькая");
        this.availablePizzaSizesAndTranslation.put("medium", "средняя");
        this.availablePizzaSizesAndTranslation.put("large", "большая");
    }

    public Map<String, String> getAvailablePizzaSizesAndTranslation() {
        return availablePizzaSizesAndTranslation;
    }
}
