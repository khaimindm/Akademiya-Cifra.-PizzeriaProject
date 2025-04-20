package ru.academy.pizzeria.objects;

import java.util.HashSet;
import java.util.Set;

// Класс с набором допустимых размеров пицц
public class AvailablePizzaSizes {

    protected Set<String> availablePizzaSizes;

    public AvailablePizzaSizes() {
        this.availablePizzaSizes = new HashSet<>();

        this.availablePizzaSizes.add("small");
        this.availablePizzaSizes.add("medium");
        this.availablePizzaSizes.add("large");
    }

    public Set<String> getAvailablePizzaSizes() {
        return availablePizzaSizes;
    }
}
