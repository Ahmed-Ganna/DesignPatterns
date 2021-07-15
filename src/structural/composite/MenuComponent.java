package structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {

    private String name,url;

    protected List<MenuComponent> menuComponents = new ArrayList<>();

    public MenuComponent(String name, String url) {
        this.name = name;
        this.url = url;
    }


    public abstract String toString();

    String print(MenuComponent menuComponent) {
        StringBuilder builder = new StringBuilder(name);
        builder.append(": ");
        builder.append(url);
        builder.append("\n");
        return builder.toString();
    }
}
