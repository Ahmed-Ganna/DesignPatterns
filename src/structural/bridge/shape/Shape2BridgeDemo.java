package structural.bridge.shape;


public class Shape2BridgeDemo {

    public static void main(String[] args){

        Color green = new Green();
        Color red = new Red();

        Shape greenSquare = new Square(green);
        Shape redCircle = new Circle(red);

        greenSquare.applyColor();
        redCircle.applyColor();
    }
}
