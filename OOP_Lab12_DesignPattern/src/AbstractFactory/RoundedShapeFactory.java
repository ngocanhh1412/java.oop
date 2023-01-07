package AbstractFactory;

public class RoundedShapeFactory extends AbstractFactory {
    public Shape getShape(String type) {
        if (type.equalsIgnoreCase("rectangle")) {
            return new RoundedRectangle();
        } else {
            return new RoundedSquare();
        }
    }
}
