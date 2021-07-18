package structural.flyweight;

import java.util.HashMap;

public class Catalog {
    private final HashMap<String,Item> items = new HashMap<>();


    //factory method
    public Item lookup(String itemName) {
        if (!items.containsKey(itemName))
            items.put(itemName, new Item(itemName));
        return items.get(itemName);
    }

    public int totalItemsMade() {
        return items.size();
    }

}
