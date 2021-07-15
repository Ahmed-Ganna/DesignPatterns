package structural.composite;

public class Menu extends MenuComponent{


    public Menu(String name, String url) {
        super(name, url);
    }



    public MenuComponent add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
        return menuComponent;
    }


    public MenuComponent remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
        return menuComponent;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        builder.append(print(this));

        for (MenuComponent menuComponent : menuComponents) {
            builder.append(menuComponent.toString());
        }

        return builder.toString();
    }
}
