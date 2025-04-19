import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.academy.pizzeria.exceptions.*;
import ru.academy.pizzeria.objects.*;

public class Main {

    private static final Logger log = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        Kitchen kitchen = new Kitchen();
        OrderConfirmation orderConfirmation = new OrderConfirmation();

        try {

            // Создаем 3 вида пиццы
            VegetarianPizza vegetarianPizza = new VegetarianPizza("Маргарита", 570, "small", true);
            StandardPizza standardPizza = new StandardPizza("Пепперони", 610, "medium");
            SweetPizza sweetPizza = new SweetPizza("Тропикана", 710, "large", true);

            // Создаем нового клиента. Указываем имя и максимальное количество доступных для него заказов
            ClientOrders clientOrders = new ClientOrders("Дмитрий", 5);

            // Добавляем заказ в список
            clientOrders.addProduct(vegetarianPizza);
            clientOrders.addProduct(standardPizza);
            clientOrders.addProduct(sweetPizza);


            if (orderConfirmation.confirm(clientOrders.getClientOrders(), clientOrders.getNameOfTheClient())) {
                kitchen.addToOrders(clientOrders.getClientOrders()); // Отправляем все заказы клиента на кухню
            }

        } catch (PriceException | MaxCapacityException | SizeException | EmptyClientOrdersException |
                 MaxNumberOfOrdersForKitchenException e) {
            log.error("Ошибка", e);
        }

    }
}