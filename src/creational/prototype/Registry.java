package creational.prototype;

import java.util.HashMap;

public class Registry {
    private final HashMap<String,Item> items = new HashMap<>();


    public Registry() {
        loadItems();
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Basic movie");
        movie.setPrice("$ 50");
        movie.setRunTime("32 min");

        items.put("movie",movie);

        Book book = new Book();
        book.setTitle("Basic Book");
        book.setPrice("$ 60");
        book.setNumberOfPages("30");

        items.put("book",book);

    }

    public Item getItem(String type){
        Item item = null;
        try {
            item = ((Item) items.get(type).clone());
        }catch (CloneNotSupportedException exception){
            exception.printStackTrace();
        }
        return item;
    }
}
