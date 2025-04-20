package ru.academy.pizzeria.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.academy.pizzeria.exceptions.TranslationException;

import java.util.HashMap;
import java.util.Map;

// Класс для перевода размера пиццы на русский язык
public class TranslatingPizzaSize {

    private static final Logger log = LogManager.getLogger(TranslatingPizzaSize.class);

    // Отображение, содержащее размер на английском и его перевод на русский
    protected Map<String, String> sizesEnglishRussian;

    public TranslatingPizzaSize() {
        this.sizesEnglishRussian = new HashMap<>();

        sizesEnglishRussian.put("small", "маленькая");
        sizesEnglishRussian.put("medium", "средняя");
        sizesEnglishRussian.put("large", "большая");
    }

    // Перевод на русский язык
    public String getTranslation(String sizeInEnglish) throws TranslationException {
        log.debug("Проверяем наличие перевода для предоставляемого значения");
        if (!sizesEnglishRussian.containsKey(sizeInEnglish)) {
            throw new TranslationException(sizeInEnglish);
        }
        return sizesEnglishRussian.get(sizeInEnglish);
    }

}
