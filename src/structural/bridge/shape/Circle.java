package structural.bridge.shape;

public class Circle extends Shape{


    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor(){
        color.applyColor();
    }
}
