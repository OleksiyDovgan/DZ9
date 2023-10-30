package coffee.order;

import java.util.ArrayList;
import java.util.List;

public class CoffeeOrderBoard {
    private List<Order> orders = new ArrayList<>();
    private int orderNumber = 1;

    public void addOrder(String name) {
        Order order = new Order(orderNumber, name);
        orders.add(order);
        orderNumber++;
    }

    public Order deliver() {
        if (orders.isEmpty()) {
            return null;
        }
        Order deliveredOrder = orders.remove(0);
        return deliveredOrder;
    }

    public Order deliver(int orderNumber) {
        for (Order order : orders) {
            if (order.getNumber() == orderNumber) {
                orders.remove(order);
                return order;
            }
        }
        return null;
    }

    public void draw() {
        if (orders.isEmpty()) {
            System.out.println("No orders in the queue.");
            return;
        }

        System.out.println("==================");
        System.out.println("Num | Name");
        for (Order order : orders) {
            System.out.println(order.getNumber() + " | " + order.getName());
        }
    }
}

