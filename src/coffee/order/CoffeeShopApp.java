package coffee.order;

public class CoffeeShopApp {
    public static void main(String[] args) {
        CoffeeOrderBoard coffeeBoard = new CoffeeOrderBoard();

        coffeeBoard.addOrder("Alen");
        coffeeBoard.addOrder("Yoda");
        coffeeBoard.addOrder("Obi-van");
        coffeeBoard.addOrder("John Snow");

        coffeeBoard.draw();

        Order deliveredOrder = coffeeBoard.deliver();
        if (deliveredOrder != null) {
            System.out.println("Delivered Order: #" + deliveredOrder.getNumber() + ", Name: " + deliveredOrder.getName());
        }

        int orderNumberToDeliver = 2;
        Order specificDeliveredOrder = coffeeBoard.deliver(orderNumberToDeliver);
        if (specificDeliveredOrder != null) {
            System.out.println("Delivered Order: #" + specificDeliveredOrder.getNumber() + ", Name: " + specificDeliveredOrder.getName());
        }

        coffeeBoard.draw();
    }
}
