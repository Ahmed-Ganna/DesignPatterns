package structural.composite;


public class CompositeDemo {

    public static void main(String[] args){

        Menu menu = new Menu("Actions","https//:actions");

        menu.add(new MenuItem("Go","//go"));
        menu.add(new MenuItem("Back","//back"));


        System.out.print(menu);
    }
}
