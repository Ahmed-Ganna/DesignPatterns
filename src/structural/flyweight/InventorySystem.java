package structural.flyweight;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventorySystem {
    private final List<Order> orders = new CopyOnWriteArrayList<>();
    private final Catalog catalog = new Catalog();


    public void takeOrder(String itemName, int orderNumber){
        Item item = catalog.lookup(itemName);
        orders.add(new Order(orderNumber,item));
    }


    void process() {
        for (Order order : orders) {
            order.processOrder();
            orders.remove(order);
        }
    }

    String report() {
        return "\nTotal Item objects made: "
                + catalog.totalItemsMade();
    }
}
