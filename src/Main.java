import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.academy.pizzeria.exceptions.*;
import ru.academy.pizzeria.objects.*;

import java.util.Scanner;

public class Main {

    private static final Logger log = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws TranslationException {

        Scanner console = new Scanner(System.in);

        MenuOutputHandler menuOutput = new MenuOutputHandler();

        KitchenOrderHandler kitchenOrderHandler = new KitchenOrderHandler();
        OrderConfirmation orderConfirmation = new OrderConfirmation();

        try {

            // Создаем пиццы и добавляем в меню
            Pizza margarita = new VegetarianPizza("Маргарита", 570, "small");
            menuOutput.getMenu().add(margarita);
            Pizza chetyreSyra = new VegetarianPizza("4 сыра", 790, "medium");
            menuOutput.getMenu().add(chetyreSyra);

            Pizza pepperoni = new StandardPizza("Пепперони", 610, "medium");
            menuOutput.getMenu().add(pepperoni);
            Pizza ohotnichya = new StandardPizza("Охотничья", 355, "small");
            menuOutput.getMenu().add(ohotnichya);

            Pizza tropikana = new SweetPizza("Тропикана", 710, "large");
            menuOutput.getMenu().add(tropikana);

            // Создаем нового клиента. Указываем имя
            ClientsOrderHandler clientsOrderHandler = new ClientsOrderHandler("Александр");

            // Добавляем пиццы в заказ
            clientsOrderHandler.addProduct(margarita);
            clientsOrderHandler.addProduct(pepperoni);
            clientsOrderHandler.addProduct(tropikana);

            if (orderConfirmation.confirm(clientsOrderHandler.getClientOrders(), clientsOrderHandler.getNameOfTheClient())) {
                kitchenOrderHandler.addToOrders(clientsOrderHandler.getClientOrders()); // Отправляем все заказы клиента на кухню
            }

        } catch (PriceException | SizeException | EmptyClientOrdersException | MaxNumberOfOrdersForKitchenException |
                 TranslationException e) {
            log.error("Ошибка", e);
        }

        // Запрос на показ меню
        System.out.println();
        System.out.println("Показать меню? Введите: Да / Нет");
        String answer = console.nextLine();
        if (answer.equals("Да")) {
            menuOutput.showTheMenu();
        }

    }
}